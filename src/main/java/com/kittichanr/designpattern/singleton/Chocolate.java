package com.kittichanr.designpattern.singleton;

public class Chocolate {
    public static void main(String[] args) {
        System.out.println(ChocolateBoiler.getInstance().isBoiled());

    }
}
