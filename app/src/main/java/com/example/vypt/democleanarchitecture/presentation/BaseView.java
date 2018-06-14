package com.example.vypt.democleanarchitecture.presentation;

public interface BaseView {

    void showProgress();
    void hideProgress();
    void showError(String message);
}
