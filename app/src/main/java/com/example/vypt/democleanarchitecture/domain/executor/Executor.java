package com.example.vypt.democleanarchitecture.domain.executor;

import com.example.vypt.democleanarchitecture.domain.interactors.AbstractInteractor;

public interface Executor {

    void execute(final AbstractInteractor interactor);
}
