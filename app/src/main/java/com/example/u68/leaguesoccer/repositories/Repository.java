package com.example.u68.leaguesoccer.repositories;

import com.example.u68.leaguesoccer.models.League;
import com.example.u68.leaguesoccer.models.Team;
import com.example.u68.leaguesoccer.services.IService;
import com.example.u68.leaguesoccer.services.ServicesFactory;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;

public class Repository {

    private IService iService;

    public Repository(){
        ServicesFactory servicesFactory = new ServicesFactory();
        iService = (IService) servicesFactory.getInstanceServices(IService.class);
    }

    public ArrayList<Team> getListTeam(String idLiga) throws IOException {

        try{
            Call<ArrayList<Team>> call = iService.loadTeams(idLiga);
            Response<ArrayList<Team>> response =  ((Call) call).execute();
            if(response.errorBody()!=null){
                throw defaultError();
            }else{
                return response.body();
            }

        }catch(IOException e){
            throw defaultError();
        }
    }

    public ArrayList<League> getListLeagues() throws IOException {

        try{
            Call<ArrayList<League>> call = iService.loadLeagues();
            Response<ArrayList<League>> response =  ((Call) call).execute();
            if(response.errorBody()!=null){
                throw defaultError();
            }else{
                return response.body();
            }

        }catch(IOException e){
            throw defaultError();
        }
    }


    private IOException defaultError() {
        return new IOException("Ha ocurrido un error");
    }

}
