package factory;

import chair.Chair;
import coffee_table.CoffeeTable;
import sofa.Sofa;

public interface FurnitureFactory {

    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
