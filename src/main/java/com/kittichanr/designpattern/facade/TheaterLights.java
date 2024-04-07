package com.kittichanr.designpattern.facade;

public class TheaterLights {
    public void on() {
        System.out.println("TheaterLights on");
    }

    public void off() {
        System.out.println("TheaterLights off");
    }

    public void dim(Integer number) {
        System.out.println("TheaterLights dim" + number);
    }

    @Override
    public String toString() {
        return "TheaterLights{}";
    }
}
