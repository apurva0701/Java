import java.util.Scanner;

class Employee {
    private String name;

    // Subtask 1: Common employee behavior
    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Employee: " + name);
    }
}

// Subtask 2: Inherit Employee
class Developer extends Employee {

    // Subtask 3: Developer-specific behavior
    public void showLanguage(String language) {
        System.out.println("Language: " + language);
    }
}

class Practice142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String language = sc.nextLine();

        Developer developer = new Developer();

        developer.setName(name);
        developer.showName();

        developer.showLanguage(language);

        sc.close();
    }
}