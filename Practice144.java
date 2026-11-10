import java.util.Scanner;

class Person {
    private String name;

    public void setName(String value) {
        name = value;
    }

    public void showName() {
        System.out.println("Name: " + name);
    }
}

// Trainer inherits Person
class Trainer extends Person {

    public void showRole() {
        System.out.println("Role: Trainer");
    }
}

class Practice144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        // Create Trainer object
        Trainer trainer = new Trainer();

        // Call inherited methods
        trainer.setName(name);
        trainer.showName();

        // Call child-specific method
        trainer.showRole();

        sc.close();
    }
}