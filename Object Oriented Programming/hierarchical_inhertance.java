class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void carSpecificFeature() {
        System.out.println("This car has " + numDoors + " doors.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car details: " + numDoors + " doors");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    public void motorcycleSpecificFeature() {
        if (hasSidecar)
            System.out.println("This motorcycle has a sidecar.");
        else
            System.out.println("This motorcycle does not have a sidecar.");
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    public void truckSpecificFeature() {
        System.out.println("Load capacity: " + loadCapacity + " tons.");
    }
}

public class hierarchical_inhertance {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        Motorcycle bike = new Motorcycle("Harley-Davidson", "Street 750", 2018, false);
        Truck truck = new Truck("Volvo", "FH16", 2019, 25.0);

        car.displayInfo();
        car.carSpecificFeature();

        bike.displayInfo();
        bike.motorcycleSpecificFeature();

        truck.displayInfo();
        truck.truckSpecificFeature();
    }
}
