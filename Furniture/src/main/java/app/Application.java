package app;

import chair.Chair;
import coffee_table.CoffeeTable;
import factory.FurnitureFactory;
import sofa.Sofa;

public class Application {
    private final Chair chair;
    private final Sofa sofa;
    private final CoffeeTable coffeeTable;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void paint() {
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putOn();
    }
}
