import java.util.Scanner;

class Animal {
    void showCategory() {
        System.out.println("Category: Animal");
    }
}

class Dog extends Animal {
    void showDog(String name) {
        System.out.println("Dog: " + name);
    }
}

class Cat extends Animal {
    void showCat(String name) {
        System.out.println("Cat: " + name);
    }
}

class Practice147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dogName = sc.nextLine();
        String catName = sc.nextLine();

        // Create Dog object
        Dog dog = new Dog();

        dog.showCategory();
        dog.showDog(dogName);

        // Create Cat object
        Cat cat = new Cat();

        cat.showCategory();
        cat.showCat(catName);

        sc.close();
    }
}