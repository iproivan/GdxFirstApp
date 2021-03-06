package com.mygdx.game.common;

import com.mygdx.game.ApplicationListenerSample;

public class SampleInfo {
    private  final String name;
    private final Class<?> clazz;

    public SampleInfo(Class<?> clazz){
        this.clazz = clazz;
        name = clazz.getSimpleName();
    }

    public String getName() {
        return name;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}
