package com.example.vypt.democleanarchitecture.presentation;

public interface BasePresenter {

    void resume();
    void pause();
    void destroy();
    void stop();

    void OnError(String message);

}
