package com.kittichanr.designpattern.strategy;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("knight fight");
    }
}
