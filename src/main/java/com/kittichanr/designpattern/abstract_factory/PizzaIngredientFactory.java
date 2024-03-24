package com.kittichanr.designpattern.abstract_factory;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggie[] createVeggie();

    public Pepperoni createPepperoni();

    public Clam createClam();
}
