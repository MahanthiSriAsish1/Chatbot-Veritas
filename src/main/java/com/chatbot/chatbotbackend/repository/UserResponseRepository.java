package com.chatbot.chatbotbackend.repository;

import com.chatbot.chatbotbackend.model.UserResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserResponseRepository extends MongoRepository<UserResponse, String> {

}
