package com.kittichanr.designpattern.facade;

public class Screen {
    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Screen down");
    }

    @Override
    public String toString() {
        return "Screen{}";
    }
}
