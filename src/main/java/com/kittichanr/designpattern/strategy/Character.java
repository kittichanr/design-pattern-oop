package com.kittichanr.designpattern.strategy;

public abstract class Character {
    WeaponBehavior weapon;

    abstract public void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void useWeapon() {
        weapon.useWeapon();
    }
}
