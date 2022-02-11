package com.mherman22.katiscoLeague.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long User_id;

    private String Username;

    private String Password;

    private Number Mobile_tel;

    private String Email; 

    private String User_photo;
    
    private String Created_at;

    private String Updated_at;    
    
    public User() {
    }

    public User(Long user_id, String username, String password, Number mobile_tel, String email, String user_photo,
            String created_at, String updated_at) {
        User_id = user_id;
        Username = username;
        Password = password;
        Mobile_tel = mobile_tel;
        Email = email;
        User_photo = user_photo;
        Created_at = created_at;
        Updated_at = updated_at;
    }

    public Long getUser_id() {
        return User_id;
    }

    public void setUser_id(Long user_id) {
        User_id = user_id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Number getMobile_tel() {
        return Mobile_tel;
    }

    public void setMobile_tel(Number mobile_tel) {
        Mobile_tel = mobile_tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUser_photo() {
        return User_photo;
    }

    public void setUser_photo(String user_photo) {
        User_photo = user_photo;
    }

    public String getCreated_at() {
        return Created_at;
    }

    public void setCreated_at(String created_at) {
        Created_at = created_at;
    }

    public String getUpdated_at() {
        return Updated_at;
    }
    
    public void setUpdated_at(String updated_at) {
        Updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "User [Created_at=" + Created_at + ", Email=" + Email + ", Mobile_tel=" + Mobile_tel + ", Password="
                + Password + ", Updated_at=" + Updated_at + ", User_id=" + User_id + ", User_photo=" + User_photo
                + ", Username=" + Username + "]";
    }      
}
