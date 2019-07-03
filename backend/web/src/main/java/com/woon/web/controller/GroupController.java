package com.woon.web.controller;

import java.util.HashMap;

import com.woon.web.domain.GroupDTO;
import com.woon.web.entities.Group;
import com.woon.web.repositories.GroupRepository;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}