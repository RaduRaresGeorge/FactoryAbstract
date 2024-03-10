import factory.ModernFurnitureFactory;
import factory.VictorianFurnitureFactory;
import factory.FurnitureFactory;
import app.Application;

public class Demo {
    public static void main(String[] args) {
        Application app = new Application(new VictorianFurnitureFactory());
        System.out.println();
        app.paint();
        System.out.println();
        System.out.println();
        app = new Application(new ModernFurnitureFactory());
        System.out.println();
        app.paint();
    }
}
