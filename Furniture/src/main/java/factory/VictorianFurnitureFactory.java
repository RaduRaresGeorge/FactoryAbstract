package factory;

import chair.Chair;
import chair.VictorianChair;
import coffee_table.CoffeeTable;
import coffee_table.VictorianCoffeeTable;
import sofa.Sofa;
import sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{

    public Chair createChair() {
        System.out.println("Creating a Victorian chair.");
        return new VictorianChair();
    }

    public Sofa createSofa() {
        System.out.println("Creating a Victorian sofa.");
        return new VictorianSofa();
    }

    public CoffeeTable createCoffeeTable() {
        System.out.println("Creating a Victorian coffee table.");
        return new VictorianCoffeeTable();
    }
}
