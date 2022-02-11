package com.mherman22.katiscoLeague.model;

public class Name {
    private String first_name;

    private String second_name;

    private String last_name;
    
    public Name() {
    }

    public Name(String first_name, String second_name, String last_name) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Name [first_name=" + first_name + ", last_name=" + last_name + ", second_name=" + second_name + "]";
    }
    
}
