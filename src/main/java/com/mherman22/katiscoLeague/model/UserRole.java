package com.mherman22.katiscoLeague.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserRole {

    @Id
    @GeneratedValue
    private Long User_role_id;
    private String User_role_name;
    private String User_role_desc;
    public Long getUser_role_id() {
        return User_role_id;
    }
    public void setUser_role_id(Long user_role_id) {
        User_role_id = user_role_id;
    }
    public String getUser_role_name() {
        return User_role_name;
    }
    public void setUser_role_name(String user_role_name) {
        User_role_name = user_role_name;
    }
    public String getUser_role_desc() {
        return User_role_desc;
    }
    public void setUser_role_desc(String user_role_desc) {
        User_role_desc = user_role_desc;
    }
    @Override
    public String toString() {
        return "UserRole [User_role_desc=" + User_role_desc + ", User_role_id=" + User_role_id + ", User_role_name="
                + User_role_name + "]";
    }

}
