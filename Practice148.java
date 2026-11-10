import java.util.Scanner;

class Vehicle {
    void showCategory() {
        System.out.println("Category: Vehicle");
    }
}

class Car extends Vehicle {
    void showCar(String name) {
        System.out.println("Car: " + name);
    }
}

class Bike extends Vehicle {
    void showBike(String name) {
        System.out.println("Bike: " + name);
    }
}

class Practice148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carName = sc.nextLine();
        String bikeName = sc.nextLine();

        // Create one of each and display all four lines.
        Car car = new Car();
        car.showCategory();
        car.showCar(carName);

        Bike bike = new Bike();
        bike.showCategory();
        bike.showBike(bikeName);

        sc.close();
    }
}