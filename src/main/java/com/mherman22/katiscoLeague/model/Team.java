package com.mherman22.katiscoLeague.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
@Team POJO
**/

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long Team_id;

    private String Team_name;

    private String Team_description;
    
    private Boolean isPicked;
    
    public Team() {
    }
    
    public Team(Long team_id, String team_name, String team_description, Boolean isPicked) {
        Team_id = team_id;
        Team_name = team_name;
        Team_description = team_description;
        this.isPicked = isPicked;
    }

    public Long getTeam_id() {
        return Team_id;
    }

    public void setTeam_id(Long team_id) {
        Team_id = team_id;
    }

    public String getTeam_name() {
        return Team_name;
    }

    public void setTeam_name(String team_name) {
        Team_name = team_name;
    }

    public String getTeam_description() {
        return Team_description;
    }

    public void setTeam_description(String team_description) {
        Team_description = team_description;
    }

    public Boolean getIsPicked() {
        return isPicked;
    }
    
    public void setIsPicked(Boolean isPicked) {
        this.isPicked = isPicked;
    }

    @Override
    public String toString() {
        return "Team [Team_description=" + Team_description + ", Team_id=" + Team_id + ", Team_name=" + Team_name
                + ", isPicked=" + isPicked + "]";
    }
}
