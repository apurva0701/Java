import java.util.Scanner;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

// Car inherits Vehicle
class Car extends Vehicle {

    void showCar(String name) {
        System.out.println("Car: " + name);
    }
}

class Practice143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        // Create a Car object
        Car car = new Car();

        // Call inherited method
        car.start();

        // Display car name
        car.showCar(name);

        sc.close();
    }
}