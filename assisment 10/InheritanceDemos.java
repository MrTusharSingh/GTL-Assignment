class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

class Bike extends Vehicle {
    void brake() {
        System.out.println("Bike is braking");
    }
}

public class InheritanceDemos {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.accelerate();

        Bike bike = new Bike();
        bike.run();
        bike.brake();
    }
}