
import java.util.Scanner;

class Rectangle {
    int calculateArea(int length, int breadth) {
        // Return area
        return length * breadth;
    }
}

public class Practic39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        // Create object
        Rectangle obj = new Rectangle();

        // Call calculateArea()
        int area = obj.calculateArea(length, breadth);

        // Print area
        System.out.println("Area: " + area);

        scanner.close();
    }
}
