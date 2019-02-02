package com.example.u68.leaguesoccer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("idTeam")
    @Expose
    private String idTeam;

    @SerializedName("strTeam")
    @Expose
    private String strTeam;

    @SerializedName("strTeamShort")
    @Expose
    private String strTeamShort;

    @SerializedName("strSport")
    @Expose
    private String strSport;

    @SerializedName("strLeague")
    @Expose
    private String strLeague;

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public String getStrTeamShort() {
        return strTeamShort;
    }

    public void setStrTeamShort(String strTeamShort) {
        this.strTeamShort = strTeamShort;
    }

    public String getStrSport() {
        return strSport;
    }

    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }
}
