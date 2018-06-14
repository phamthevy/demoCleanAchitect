package com.example.vypt.democleanarchitecture.thread;

import android.os.Handler;
import android.os.Looper;

import com.example.vypt.democleanarchitecture.domain.executor.MainThread;


public class MainThreadImp implements MainThread{

    private static MainThread mainThread;
    private Handler handler;

    public MainThreadImp(){
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void post(Runnable runnable){
        handler.post(runnable);
    }

    public static MainThread getMainThread() {
        if (mainThread == null) {
            mainThread = new MainThreadImp();
        }
        return mainThread;
    }
}
