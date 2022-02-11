package com.mherman22.katiscoLeague.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MatchTeamStats {
    @Id
    @GeneratedValue
    private Long Match_team_stats_id;
    private String Scores_home_team;
    private String Scores_away_team;
    public Long getMatch_team_stats_id() {
        return Match_team_stats_id;
    }
    public void setMatch_team_stats_id(Long match_team_stats_id) {
        Match_team_stats_id = match_team_stats_id;
    }
    public String getScores_home_team() {
        return Scores_home_team;
    }
    public void setScores_home_team(String scores_home_team) {
        Scores_home_team = scores_home_team;
    }
    public String getScores_away_team() {
        return Scores_away_team;
    }
    public void setScores_away_team(String scores_away_team) {
        Scores_away_team = scores_away_team;
    }
    @Override
    public String toString() {
        return "MatchTeamStats [Match_team_stats_id=" + Match_team_stats_id + ", Scores_away_team=" + Scores_away_team
                + ", Scores_home_team=" + Scores_home_team + "]";
    }

}
