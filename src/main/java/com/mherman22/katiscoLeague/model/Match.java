package com.mherman22.katiscoLeague.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Match {

    @Id 
    @GeneratedValue
    private Long Match_id;

    private Date Match_date;

    private String Match_time;

    private String Match_location;

    private String Score_home_team;

    private String score_away_team;
    
    private Boolean Is_played;
    
    public Match() {
    }

    public Match(Long match_id, Date match_date, String match_time, String match_location, String score_home_team,
            String score_away_team, Boolean is_played) {
        Match_id = match_id;
        Match_date = match_date;
        Match_time = match_time;
        Match_location = match_location;
        Score_home_team = score_home_team;
        this.score_away_team = score_away_team;
        Is_played = is_played;
    }



    public Long getMatch_id() {
        return Match_id;
    }

    public void setMatch_id(Long match_id) {
        Match_id = match_id;
    }

    public Date getMatch_date() {
        return Match_date;
    }

    public void setMatch_date(Date match_date) {
        Match_date = match_date;
    }

    public String getMatch_time() {
        return Match_time;
    }

    public void setMatch_time(String match_time) {
        Match_time = match_time;
    }

    public String getMatch_location() {
        return Match_location;
    }

    public void setMatch_location(String match_location) {
        Match_location = match_location;
    }

    public String getScore_home_team() {
        return Score_home_team;
    }

    public void setScore_home_team(String score_home_team) {
        Score_home_team = score_home_team;
    }

    public String getScore_away_team() {
        return score_away_team;
    }

    public void setScore_away_team(String score_away_team) {
        this.score_away_team = score_away_team;
    }

    public Boolean getIs_played() {
        return Is_played;
    }

    public void setIs_played(Boolean is_played) {
        Is_played = is_played;
    }

    @Override
    public String toString() {
        return "Match [Is_played=" + Is_played + ", Match_date=" + Match_date + ", Match_id=" + Match_id
                + ", Match_location=" + Match_location + ", Match_time=" + Match_time + ", Score_home_team="
                + Score_home_team + ", score_away_team=" + score_away_team + "]";
    }

}
