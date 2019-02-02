package com.example.u68.leaguesoccer.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.u68.leaguesoccer.R;
import com.example.u68.leaguesoccer.models.League;
import com.example.u68.leaguesoccer.presenters.MainPresenter;
import com.example.u68.leaguesoccer.views.interfaces.BaseActivity;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainView {

    private ProgressBar progressBar;
    private ImageView imagenInicio;


    //TODO: CREAR MODELOS PARA LA RESPUESTA DEL GET DE EQUIPOS
    //TODO: CREAR UN PARAMETRO EN ESTA MISMA CLASE DE TIPO 'EQUIPOS'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setComponents();
        progressBar= new ProgressBar(this);
        setPresenter(new MainPresenter());
        getPresenter().inject(this, getValidateInternet());
        if(!getPresenter().getValidateInternet().isConnected()){
            showToast("");
        }
        loadLeagues();
        Intent intent = new Intent(MainActivity.this, DatosLigaActivity.class);

    }

    private void setComponents(){
        imagenInicio = findViewById(R.id.imageInicio);
        progressBar = findViewById(R.id.pbInicio);
    }

    private void createThreadtoInitList() {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    //TODO: AGREGAR AL INTENT EL OBJETO QUE ESTA ARRIBITA CON LA INFO DE LOS EQUIPOS
                    Thread.sleep(6000);
                    Intent intent = new Intent("team_list");
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }



    private void loadLeagues() {
        loadAllLeagues(getPresenter().getListLigues());
    }

    public void loadAllLeagues(ArrayList<League> listLeagues) {

    }

    @Override
    public void showToast(int result) {

    }
}
