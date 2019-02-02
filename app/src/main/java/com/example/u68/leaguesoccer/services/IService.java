package com.example.u68.leaguesoccer.services;

import com.example.u68.leaguesoccer.models.League;
import com.example.u68.leaguesoccer.models.Team;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IService {

    @GET("all_leagues.php")
    Call<ArrayList<League>> loadLeagues();


    @GET("lookup_all_teams.php/{id}")
    Call<ArrayList<Team>> loadTeams(@Path("id") String id);
}
