package factory;

import chair.Chair;
import chair.ModernChair;
import coffee_table.CoffeeTable;
import coffee_table.ModernCoffeeTable;
import sofa.ModernSofa;
import sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{

        public Chair createChair() {
            System.out.println("Creating a modern chair.");
            return new ModernChair();
        }

        public Sofa createSofa() {
            System.out.println("Creating a modern sofa.");
            return new ModernSofa();
        }

        public CoffeeTable createCoffeeTable() {
            System.out.println("Creating a modern coffee table.");
            return new ModernCoffeeTable();
        }
}
