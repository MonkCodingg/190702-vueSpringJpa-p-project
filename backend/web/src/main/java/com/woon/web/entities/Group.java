package com.woon.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Groups
 */
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
@Setter
@ToString
@Table(name = "groups")
public class Group implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long groupno;
    @Column(name="groupname")private String groupname;
    @Column(name="groupintro")private String groupintro;
    @Column(name="groupleader")private String groupleader;
    
    @Override
    public String toString(){
        return String.format("GROUP No: %d\n"
        +"GROUP NAME: %s\n"
        +"GROUP INTRODUCE: %s\n"
        +"GROUP LEADER: %s\n"
        , groupno, groupname, groupintro, groupleader);
    }

    @Builder
    private Group(String groupname, 
                    String groupintro, 
                    String groupleader){
        this.groupname = groupname;
        this.groupintro = groupintro;
        this.groupleader = groupleader;
    }
}