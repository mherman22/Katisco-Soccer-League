package com.mherman22.katiscoLeague.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LeagueStandings {

    @Id
    @GeneratedValue
    private Long Standings_id;
// Season_league_id (FK)
// Season_league_team_id (FK)
    private String Matches_played;
    private String Team_wins;
    private String Team_draws;
    private String Team_losses;
    private String goals_forward;
    private String goals_against;
    private String goal_difference;
    private String Team_points_obtained;
    private String Team_rank;
    private String Total_league_teams;
    
    public Long getStandings_id() {
        return Standings_id;
    }

    public void setStandings_id(Long standings_id) {
        Standings_id = standings_id;
    }

    public String getMatches_played() {
        return Matches_played;
    }

    public void setMatches_played(String matches_played) {
        Matches_played = matches_played;
    }

    public String getTeam_wins() {
        return Team_wins;
    }

    public void setTeam_wins(String team_wins) {
        Team_wins = team_wins;
    }

    public String getTeam_draws() {
        return Team_draws;
    }

    public void setTeam_draws(String team_draws) {
        Team_draws = team_draws;
    }

    public String getTeam_losses() {
        return Team_losses;
    }

    public void setTeam_losses(String team_losses) {
        Team_losses = team_losses;
    }

    public String getGoals_forward() {
        return goals_forward;
    }

    public void setGoals_forward(String goals_forward) {
        this.goals_forward = goals_forward;
    }

    public String getGoals_against() {
        return goals_against;
    }

    public void setGoals_against(String goals_against) {
        this.goals_against = goals_against;
    }

    public String getGoal_difference() {
        return goal_difference;
    }

    public void setGoal_difference(String goal_difference) {
        this.goal_difference = goal_difference;
    }

    public String getTeam_points_obtained() {
        return Team_points_obtained;
    }

    public void setTeam_points_obtained(String team_points_obtained) {
        Team_points_obtained = team_points_obtained;
    }

    public String getTeam_rank() {
        return Team_rank;
    }

    public void setTeam_rank(String team_rank) {
        Team_rank = team_rank;
    }

    public String getTotal_league_teams() {
        return Total_league_teams;
    }
    
    public void setTotal_league_teams(String total_league_teams) {
        Total_league_teams = total_league_teams;
    }

    @Override
    public String toString() {
        return "LeagueStandings [Matches_played=" + Matches_played + ", Standings_id=" + Standings_id + ", Team_draws="
                + Team_draws + ", Team_losses=" + Team_losses + ", Team_points_obtained=" + Team_points_obtained
                + ", Team_rank=" + Team_rank + ", Team_wins=" + Team_wins + ", Total_league_teams=" + Total_league_teams
                + ", goal_difference=" + goal_difference + ", goals_against=" + goals_against + ", goals_forward="
                + goals_forward + "]";
    }  
}
