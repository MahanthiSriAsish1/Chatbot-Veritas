package com.chatbot.chatbotbackend.service;


import com.chatbot.chatbotbackend.model.UserResponse;
import com.chatbot.chatbotbackend.repository.UserResponseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserResponseService {

    private  final UserResponseRepository userResponseRepository;

    public UserResponseService(UserResponseRepository userResponseRepository) {
        this.userResponseRepository = userResponseRepository;
    }

    public void UploadResponse(UserResponse userResponse){
        userResponseRepository.insert(userResponse);
    }

    public List<UserResponse> GetResponses(){
        return userResponseRepository.findAll();
    }

    public void DeleteResponseById(List<String> idList){
        for (String id : idList){
            userResponseRepository.deleteById(id);
        }
    }
}
