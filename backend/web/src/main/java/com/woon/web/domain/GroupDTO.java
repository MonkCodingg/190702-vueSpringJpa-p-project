package com.woon.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * GroupDTO
 */
@Data@Component@Lazy
public class GroupDTO {
    private Long groupno;
    private String groupname, groupintro, groupleader;   
}