package com.example.u68.leaguesoccer.presenters;

import com.example.u68.leaguesoccer.models.League;
import com.example.u68.leaguesoccer.repositories.Repository;
import com.example.u68.leaguesoccer.views.activities.IMainView;

import java.io.IOException;
import java.util.ArrayList;

public class MainPresenter extends BasePresenter<IMainView> {

    //TODO: LLAMAR ACA AL SERVICIO CON EL HILO Y TODA LA VUELTA
    private Repository repository;
    ArrayList<League>  listLigues;

    public void getOnLoadLeagues() throws IOException {
        listLigues = repository.getListLeagues();
    }

    public ArrayList<League> getListLigues() {
        return listLigues;
    }

}
