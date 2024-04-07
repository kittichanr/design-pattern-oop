package com.kittichanr.designpattern.facade;

public class StreamPlayer {
    public void on() {
        System.out.println("StreamPlayer on");
    }

    public void off() {
        System.out.println("StreamPlayer off");
    }

    public void pause() {
        System.out.println("StreamPlayer pause");
    }

    public void play(String movie) {
        System.out.println("StreamPlayer play " + movie);
    }

    public void setSurroundAudio() {
        System.out.println("StreamPlayer setSurroundAudio");
    }

    public void setTwoChannelAudio() {
        System.out.println("StreamPlayer setTwoChannelAudio");
    }

    public void stop() {
        System.out.println("StreamPlayer stop");
    }

    @Override
    public String toString() {
        return "StreamPlayer{}";
    }
}
