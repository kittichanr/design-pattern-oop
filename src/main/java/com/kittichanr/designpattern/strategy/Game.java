package com.kittichanr.designpattern.strategy;

public class Game {
    public static void main(String[] args) {
        Character king = new King();
        king.useWeapon();
        king.setWeapon(new SwordBehavior());
        king.fight();
        king.useWeapon();
    }
}
