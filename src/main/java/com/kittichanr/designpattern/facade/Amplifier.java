package com.kittichanr.designpattern.facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setStreamingPlayer(StreamPlayer player) {
        System.out.println("Amplifier setStreamingPlayer to Streaming player");
    }

    public void setStereoSound() {
        System.out.println("Amplifier setStereoSound");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setSurroundSound");
    }

    public void setTuner() {
        System.out.println("Amplifier setTuner");
    }

    public void setVolume(Integer volume) {
        System.out.println("Amplifier setVolume" + volume);
    }

    @Override
    public String toString() {
        return "Amplifier{}";
    }
}
