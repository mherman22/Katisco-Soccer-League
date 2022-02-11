package com.mherman22.katiscoLeague.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SeasonLeague {

    @Id
    @GeneratedValue
    private Long Season_league_id;
    private Date League_start;
    private Date League_end;
    private Boolean Is_closed;
    
    public Long getSeason_league_id() {
        return Season_league_id;
    }
    public void setSeason_league_id(Long season_league_id) {
        Season_league_id = season_league_id;
    }
    public Date getLeague_start() {
        return League_start;
    }
    public void setLeague_start(Date league_start) {
        League_start = league_start;
    }
    public Date getLeague_end() {
        return League_end;
    }
    public void setLeague_end(Date league_end) {
        League_end = league_end;
    }
    public Boolean getIs_closed() {
        return Is_closed;
    }
    public void setIs_closed(Boolean is_closed) {
        Is_closed = is_closed;
    }

    @Override
    public String toString() {
        return "SeasonLeague [Is_closed=" + Is_closed + ", League_end=" + League_end + ", League_start=" + League_start
                + ", Season_league_id=" + Season_league_id + "]";
    }

}
