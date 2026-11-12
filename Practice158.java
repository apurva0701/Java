import java.util.Scanner;

class Animal {
}

class Dog extends Animal {
    void showDog(String name) {
        System.out.println("Dog: " + name);
    }
}

class Cat extends Animal {
}

class Practice158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String name = sc.nextLine();

        Animal animal;
        if (type.equals("DOG")) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.showDog(name);
        } else {
            System.out.println("Not a dog");
        }

        sc.close();
    }
}