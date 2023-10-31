package com.omarcomputer.mvppattern;

public interface MVP {
    interface View{
        void showProgress();
        void hideProgress();
        void setString(String string);
    }
    interface Presenter{
        void onButtonClicked();
        void onDestroy();

    }
    interface Model{
        String getData();
    }

}
