import java.util.Scanner;

class Employee {
    String role = "Employee";
}

class Developer extends Employee {
    String role;

    void setRole(String value) {
        role = value;
    }

    void showBoth() {
        System.out.println("Child: " + role);
        System.out.println("Parent: " + super.role);
    }
}

class Practice151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();

        Developer dev = new Developer();
        dev.setRole(role);
        dev.showBoth();

        sc.close();
    }
}