package com.kittichanr.designpattern.strategy;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use knife");
    }
}
