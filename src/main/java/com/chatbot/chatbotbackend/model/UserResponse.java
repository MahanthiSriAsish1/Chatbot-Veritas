package com.chatbot.chatbotbackend.model;

import com.chatbot.chatbotbackend.model.gender.Gender;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserResponse")
public class UserResponse {

    @Id
    private String Id;
    private String Name;
    private int Age;
    private String city;
    private Gender gender;
    private double boardMarks;
    private double jeePercentile;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getBoardMarks() {
        return boardMarks;
    }

    public void setBoardMarks(double boardMarks) {
        this.boardMarks = boardMarks;
    }

    public double getJeePercentile() {
        return jeePercentile;
    }

    public void setJeePercentile(double jeePercentile) {
        this.jeePercentile = jeePercentile;
    }
}
