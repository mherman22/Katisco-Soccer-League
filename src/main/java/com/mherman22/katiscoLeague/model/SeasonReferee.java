package com.mherman22.katiscoLeague.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SeasonReferee {
    @Id
    @GeneratedValue
    private Long Season_referee_id;

    @Embedded
    private Name name;

    public Long getSeason_referee_id() {
        return Season_referee_id;
    }

    public void setSeason_referee_id(Long season_referee_id) {
        Season_referee_id = season_referee_id;
    }

    public Name getName() {
        return name;
    }
    
    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SeasonReferee [Season_referee_id=" + Season_referee_id + ", name=" + name + "]";
    }

}
