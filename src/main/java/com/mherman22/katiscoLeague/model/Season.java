package com.mherman22.katiscoLeague.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
@season POJO
**/

@Entity
public class Season {

    @Id
    @GeneratedValue
    private Long Season_id;
    private String Season_name;
    private Date Season_start;
    private Date Season_end;
    private Boolean isActive;
    
    public Long getSeason_id() {
        return Season_id;
    }
    public void setSeason_id(Long season_id) {
        Season_id = season_id;
    }
    public String getSeason_name() {
        return Season_name;
    }
    public void setSeason_name(String season_name) {
        Season_name = season_name;
    }
    public Date getSeason_start() {
        return Season_start;
    }
    public void setSeason_start(Date season_start) {
        Season_start = season_start;
    }
    public Date getSeason_end() {
        return Season_end;
    }
    public void setSeason_end(Date season_end) {
        Season_end = season_end;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Season [Season_end=" + Season_end + ", Season_id=" + Season_id + ", Season_name=" + Season_name
                + ", Season_start=" + Season_start + ", isActive=" + isActive + "]";
    }

}
