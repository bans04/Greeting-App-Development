package com.greetingapp.Entity;

//user class / model class / pogo class
public class User {
    //user attribute
    private long id;
    private String message;

    public User(int id, String message) {
        this.id = id;
        this.message = message;
    }

    //getters & Setter to use user fields
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
