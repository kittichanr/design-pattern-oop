package com.kittichanr.designpattern.strategy;

public class Queen extends Character {
    public Queen() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("queen fight");
    }
}
