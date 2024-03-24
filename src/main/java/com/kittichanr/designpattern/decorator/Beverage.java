package com.kittichanr.designpattern.decorator;

public abstract class Beverage {
    public enum Size {TAIL, GRANDE, VENTI}

    ;
    Size size = Size.TAIL;

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
