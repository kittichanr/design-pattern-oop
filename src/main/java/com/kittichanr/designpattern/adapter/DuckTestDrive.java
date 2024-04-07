package com.kittichanr.designpattern.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says....");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe Turkey Adapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
