import java.util.Scanner;

class Animal {
    void showName(String name) {
        System.out.println("Animal: " + name);
    }
}

// Cat inherits Animal
class Cat extends Animal {

    void showType() {
        System.out.println("Type: Cat");
    }
}

class Practice145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        // Create Cat object
        Cat cat = new Cat();

        // Call inherited parent method
        cat.showName(name);

        // Call child-specific method
        cat.showType();

        sc.close();
    }
}