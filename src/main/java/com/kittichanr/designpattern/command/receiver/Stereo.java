package com.kittichanr.designpattern.command.receiver;

public class Stereo {
    private final String location;
    private int volume;

    public Stereo(String location) {
        this.location = location;
        this.volume = 0;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");

    }

    public void setCd() {
        System.out.println(location + " stereo setCd");
    }

    public void setDvd() {
        System.out.println(location + " stereo setDvd");
    }

    public void setRadio() {
        System.out.println(location + " stereo setRadio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " stereo setVolume to " + volume);
    }
}
