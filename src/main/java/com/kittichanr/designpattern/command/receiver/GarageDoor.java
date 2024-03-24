package com.kittichanr.designpattern.command.receiver;

public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " garage door is up");
    }

    public void down() {
        System.out.println(location + " garage door is down");
    }

    public void stop() {
        System.out.println(location + " garage door is stop");
    }

    public void lightOn() {
        System.out.println(location + " garage door is lightOn");
    }

    public void lightOff() {
        System.out.println(location + " garage door is lightOff");
    }

    @Override
    public String toString() {
        return "GarageDoor{" +
                "location=" + location +
                '}';
    }
}
