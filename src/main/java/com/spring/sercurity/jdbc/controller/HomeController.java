package com.spring.sercurity.jdbc.controller;

import com.spring.sercurity.jdbc.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private IHomeService homeService;

    @GetMapping("/")
    public String welcome(){
        return homeService.getWelcomeMessage();
    }

    @GetMapping("/user")
    public String user(){
        return homeService.getUserMessage();
    }

    @GetMapping("/admin")
    public String admin(){
        return homeService.getWelcomeMessage();
    }
}
