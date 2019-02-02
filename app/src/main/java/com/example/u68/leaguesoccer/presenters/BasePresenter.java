package com.example.u68.leaguesoccer.presenters;


import com.example.u68.leaguesoccer.helper.ValidateInternet;
import com.example.u68.leaguesoccer.views.activities.MainActivity;
import com.example.u68.leaguesoccer.views.interfaces.IBaseView;

public class BasePresenter<T extends IBaseView>  {

    private ValidateInternet validateInternet;
    private T view;

    public void inject(T view, ValidateInternet validateInternet){
        this.validateInternet = validateInternet;
        this.view = view;
    }

    public ValidateInternet getValidateInternet() {
        return validateInternet;
    }

    public T getView() {
        return view;
    }


}
