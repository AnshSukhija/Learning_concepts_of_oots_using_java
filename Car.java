package Day4;

class Car1 {
    private String brand;

    // Constructor
    Car1(String brand) {
        this.brand = brand;
    }

    // Nested static class
    static class Engine {
        void start() {
            System.out.println("Engine is starting...");
        }
    }

    // Non-static inner class
    class Dashboard {
        void showBrand() {
            System.out.println("Car brand is: " + brand);
        }
    }
}

public class Car {
    public static void main(String[] args) {
        // Using static nested class (no need of Car object)
        Car1.Engine engine = new Car1.Engine();
        engine.start();

        // Using non-static inner class (needs Car object)
        Car1 myCar = new Car1("Tesla");
        Car1.Dashboard dashboard = myCar.new Dashboard();
        dashboard.showBrand();
    }
}