package com.kittichanr.designpattern.facade;

public class Projector {

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void tvMode() {
        System.out.println("Projector tvMode");
    }

    public void wideScreenMode() {
        System.out.println("Projector wideScreenMode");
    }

    @Override
    public String toString() {
        return "Projector{}";
    }
}
