
import java.util.Scanner;

class StudentUtility {
    void displayName(String name) {
        // Print student name
        System.out.println("Student: " + name);
    }
}

public class Practic35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        // Create object
        StudentUtility obj = new StudentUtility();

        // Call displayName()
        obj.displayName(name);

        scanner.close();
    }
}
