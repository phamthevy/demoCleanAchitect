package com.example.vypt.democleanarchitecture.domain.interactors;


import com.example.vypt.democleanarchitecture.domain.executor.Executor;
import com.example.vypt.democleanarchitecture.domain.executor.MainThread;


public abstract class AbstractInteractor implements Interactor{
    protected Executor executor;
    protected MainThread mainThread;

    protected volatile boolean isRunning;
    protected volatile boolean isCancel;

    public AbstractInteractor (Executor executor, MainThread mainThread){
        this.executor = executor;
        this.mainThread = mainThread;
    }

    public abstract void run();

    public void OnCancel(){
        isCancel = true;
        isRunning = false;
    }

    public void OnFinish(){
        isRunning = false;
        isCancel = false;
    }

    public void execute(){
        this.isRunning = true;
        this.isCancel = false;

        this.executor.execute(this);
    }
}
