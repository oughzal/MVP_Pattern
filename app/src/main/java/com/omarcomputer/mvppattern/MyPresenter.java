package com.omarcomputer.mvppattern;


import android.annotation.SuppressLint;

public class MyPresenter implements MVP.Presenter{
    private MVP.View view;
    private  MVP.Model model =new MyModel();

     MyPresenter(MVP.View v){
        this.view =v;
    }
    @Override
    public void onButtonClicked() {
        if(this.view != null){
            view.showProgress();
            view.setString(model.getData());
            view.hideProgress();
        }

    }

    @Override
    public void onDestroy() {
        view = null;
    }
}
