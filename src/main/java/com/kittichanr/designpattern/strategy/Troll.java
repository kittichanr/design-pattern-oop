package com.kittichanr.designpattern.strategy;

public class Troll extends Character {
    public Troll() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("troll fight");
    }
}
