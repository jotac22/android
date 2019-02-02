package com.example.u68.leaguesoccer.views.interfaces;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.u68.leaguesoccer.helper.ValidateInternet;
import com.example.u68.leaguesoccer.presenters.BasePresenter;

public class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements IBaseView {

    private ValidateInternet validateInternet;

    private T presenter;

    public ValidateInternet getValidateInternet() {
        return validateInternet;
    }

    public T getPresenter() {
        return presenter;
    }

    public void setPresenter(T presenter) {
        this.presenter = presenter;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        validateInternet = new ValidateInternet(this);
    }

    public void showToast(String mensaje){
        Toast.makeText((Context) getPresenter().getView(), mensaje, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(int result) {

    }
}
