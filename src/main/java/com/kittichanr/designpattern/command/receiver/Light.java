package com.kittichanr.designpattern.command.receiver;

public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }

    @Override
    public String toString() {
        return "Light{" +
                "location='" + location + '\'' +
                '}';
    }
}
