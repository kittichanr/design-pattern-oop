package com.kittichanr.designpattern.strategy;

public class King extends Character {
    public King() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("king fight");
    }
}
