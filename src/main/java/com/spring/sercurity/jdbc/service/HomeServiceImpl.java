package com.spring.sercurity.jdbc.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements IHomeService{


    @Override
    public String getWelcomeMessage() {
        return "Welcome to the home page";
    }

    @Override
    public String getUserMessage() {
        return "Welcome to the user page";
    }

    @Override
    public String getAdminMessage() {
        return "Welcome to the admin page";
    }
}
