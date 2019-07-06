package com.woon.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}