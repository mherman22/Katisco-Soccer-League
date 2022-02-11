package com.mherman22.katiscoLeague.model;

import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/*
@Team member POJO
**/

@Entity
public class TeamMember {

    @Id
    @GeneratedValue
    private Long Team_member_id;

    @Embedded
    private Name team_member_name;

    private Date Date_of_birth;

    private String ID_Number;

    private String photo; 

    private Date year_of_Entry;

    private Date year_of_Exit;

    private Boolean Is_approved;

    private Date Created_at ;
    
    private Date Updated_at;

    public TeamMember() {
    }
    
    public TeamMember(Long team_member_id, Name team_member_name, Date date_of_birth, String iD_Number, String photo,
            Date year_of_Entry, Date year_of_Exit, Boolean is_approved, Date created_at, Date updated_at) {
        Team_member_id = team_member_id;
        this.team_member_name = team_member_name;
        Date_of_birth = date_of_birth;
        ID_Number = iD_Number;
        this.photo = photo;
        this.year_of_Entry = year_of_Entry;
        this.year_of_Exit = year_of_Exit;
        Is_approved = is_approved;
        Created_at = created_at;
        Updated_at = updated_at;
    }

    public Date getYear_of_Entry() {
        return year_of_Entry;
    }

    public void setYear_of_Entry(Date year_of_Entry) {
        this.year_of_Entry = year_of_Entry;
    }

    public Date getYear_of_Exit() {
        return year_of_Exit;
    }

    public void setYear_of_Exit(Date year_of_Exit) {
        this.year_of_Exit = year_of_Exit;
    }
    
    public Long getTeam_member_id() {
        return Team_member_id;
    }

    public void setTeam_member_id(Long team_member_id) {
        Team_member_id = team_member_id;
    }

    public Name getTeam_member_name() {
        return team_member_name;
    }

    public void setTeam_member_name(Name team_member_name) {
        this.team_member_name = team_member_name;
    }

    public Date getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        Date_of_birth = date_of_birth;
    }

    public String getID_Number() {
        return ID_Number;
    }

    public void setID_Number(String iD_Number) {
        ID_Number = iD_Number;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getIs_approved() {
        return Is_approved;
    }

    public void setIs_approved(Boolean is_approved) {
        Is_approved = is_approved;
    }

    public Date getCreated_at() {
        return Created_at;
    }

    public void setCreated_at(Date created_at) {
        Created_at = created_at;
    }

    public Date getUpdated_at() {
        return Updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        Updated_at = updated_at;
    }
    
    @Override
    public String toString() {
        return "TeamMember [Created_at=" + Created_at + ", Date_of_birth=" + Date_of_birth + ", ID_Number=" + ID_Number
                + ", Is_approved=" + Is_approved + ", Team_member_id=" + Team_member_id + ", Updated_at=" + Updated_at
                + ", photo=" + photo + ", team_member_name=" + team_member_name + ", year_of_Entry=" + year_of_Entry
                + ", year_of_Exit=" + year_of_Exit + "]";
    }


}
