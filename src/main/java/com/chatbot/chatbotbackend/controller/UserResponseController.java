package com.chatbot.chatbotbackend.controller;

import com.chatbot.chatbotbackend.model.UserResponse;
import com.chatbot.chatbotbackend.service.UserResponseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/UserResponse")
public class UserResponseController {

    private final UserResponseService userResponseService;

    public UserResponseController(UserResponseService userResponseService) {
        this.userResponseService = userResponseService;
    }


    @PostMapping
    public ResponseEntity UploadResponse(@RequestBody UserResponse userResponse){
        userResponseService.UploadResponse(userResponse);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<UserResponse> GetResponses(){
        return userResponseService.GetResponses();
    }

    @DeleteMapping()
    public void DeleteResponseById(@RequestBody List<String> idList){
        userResponseService.DeleteResponseById(idList);
    }

}
