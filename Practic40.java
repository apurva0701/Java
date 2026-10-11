
import java.util.Scanner;

class StudentResult {
    void showTitle() {
        System.out.println("Student Result");
    }

    void displayName(String name) {
        System.out.println("Name: " + name);
    }

    int getPassingMark() {
        return 40;
    }

    int calculateAverage(int first, int second) {
        return (first + second) / 2;
    }
}

public class Practic40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        StudentResult obj = new StudentResult();

        // Call methods
        obj.showTitle();
        obj.displayName(name);

        // Print returned values
        int passingMark = obj.getPassingMark();
        System.out.println("Passing Mark: " + passingMark);

        int average = obj.calculateAverage(first, second);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
