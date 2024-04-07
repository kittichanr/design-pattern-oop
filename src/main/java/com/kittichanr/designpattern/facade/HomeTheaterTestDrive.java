package com.kittichanr.designpattern.facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        StreamPlayer player = new StreamPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amplifier, tuner, player, projector, lights, screen, popper
        );

        homeTheater.watchMovie("The Hobbits");
        homeTheater.endMovie();
    }
}
