package com.mherman22.katiscoLeague.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
@subscription POJO
**/

@Entity
public class SeasonSubscription {

    @Id
    @GeneratedValue
    private Long Team_subscription_id;
    
    private Boolean isCleared;

    public SeasonSubscription() {
    }

    public SeasonSubscription(Long team_subscription_id, Boolean isCleared) {
        Team_subscription_id = team_subscription_id;
        this.isCleared = isCleared;
    }

    public Long getTeam_subscription_id() {
        return Team_subscription_id;
    }

    public void setTeam_subscription_id(Long team_subscription_id) {
        Team_subscription_id = team_subscription_id;
    }

    public Boolean getIsCleared() {
        return isCleared;
    }
    
    public void setIsCleared(Boolean isCleared) {
        this.isCleared = isCleared;
    }

    @Override
    public String toString() {
        return "SeasonSubscription [Team_subscription_id=" + Team_subscription_id + ", isCleared=" + isCleared + "]";
    }
}
