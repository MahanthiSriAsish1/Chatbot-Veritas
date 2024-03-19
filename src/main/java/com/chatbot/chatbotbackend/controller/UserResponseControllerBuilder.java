package com.chatbot.chatbotbackend.controller;

import com.chatbot.chatbotbackend.service.UserResponseService;

public class UserResponseControllerBuilder {
    private UserResponseService userResponseService;

    public UserResponseControllerBuilder setUserResponseService(UserResponseService userResponseService) {
        this.userResponseService = userResponseService;
        return this;
    }

    public UserResponseController createUserResponseController() {
        return new UserResponseController(userResponseService);
    }
}