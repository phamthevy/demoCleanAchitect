package com.example.vypt.democleanarchitecture.presentation;

import com.example.vypt.democleanarchitecture.domain.executor.Executor;
import com.example.vypt.democleanarchitecture.domain.executor.MainThread;

public abstract class AbstractPresenter {

    protected Executor executor;
    protected MainThread mainThread;


    public AbstractPresenter(Executor executor, MainThread mainThread) {
        this.executor = executor;
        this.mainThread = mainThread;
    }
}
