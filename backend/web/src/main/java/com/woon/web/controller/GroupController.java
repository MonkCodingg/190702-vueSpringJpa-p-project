package com.woon.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.woon.web.domain.GroupDTO;
import com.woon.web.entities.Group;
import com.woon.web.repositories.GroupRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GroupController
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/groups")
public class GroupController {
    @Autowired GroupRepository repo;
    @Autowired GroupDTO groupDTO;
    @Autowired ModelMapper modelMapper;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @GetMapping("/count")
    public Long count() {
        return repo.count();
    }

    @PostMapping("")
    public HashMap<String, String> save(@RequestBody GroupDTO dto){
        System.out.println("save 그룹 생성 진입");
        System.out.println("GROUP NAME: "+dto.getGroupname());
        System.out.println("GROUP LEADER: "+dto.getGroupleader());
        HashMap<String, String> map = new HashMap<>();
        Group entity = new Group();
        entity.setGroupname(dto.getGroupname());
        entity.setGroupintro(dto.getGroupintro());
        entity.setGroupleader(dto.getGroupleader());
        System.out.println("엔티티로 바뀐 정보: "+ entity.toString());

        repo.save(entity);
        map.put("result", "SUCCESS");
        return map;
    }
    @GetMapping("/{id}")
    public GroupDTO findById(@PathVariable String id){
        System.out.println("findById 들어온 아이디: " + id);
        Group entity = repo.findById(Long.parseLong(id)).orElseThrow(EntityNotFoundException::new);
        System.out.println(">>>>" + entity.toString());
        GroupDTO dto = modelMapper.map(entity, GroupDTO.class);
        return dto;
    }
    @GetMapping("")
    public List<GroupDTO> findAll(){
        System.out.println("findAll 입장");
        Iterable<Group> entities = repo.findAll();
        List<GroupDTO> list = new ArrayList<>();
        for(Group g : entities){
            GroupDTO dto = modelMapper.map(g, GroupDTO.class);
            list.add(dto);
        }
        System.out.println(list);
        return list;
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        System.out.println("deleteById 입장 id:"+ id);
        repo.deleteById(id);
    }
    @PutMapping("/{id}")
    public HashMap<String, String> update(@PathVariable String id, @RequestBody GroupDTO dto){
        System.out.println("id");
        HashMap<String, String> map = new HashMap<>();
        Group entity = repo.findById(Long.parseLong(id)).get();
        entity.setGroupname(dto.getGroupname());
        entity.setGroupintro(dto.getGroupintro());
        entity.setGroupleader(dto.getGroupleader());
        repo.save(entity);
        map.put("result", "SUCCESS");
        return map;
    }
}