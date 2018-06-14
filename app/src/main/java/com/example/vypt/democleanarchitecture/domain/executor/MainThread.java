package com.example.vypt.democleanarchitecture.domain.executor;

public interface MainThread {
    void post(final Runnable runnable);
}
