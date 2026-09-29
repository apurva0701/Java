import java.util.Scanner;

class Student28 {
    int id;
    String name;
    int javaScore;
}

public class Practice28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        Student28 student1 = new Student28();
        student1.id = scanner.nextInt();
        student1.name = scanner.next();
        student1.javaScore = scanner.nextInt();

        // Create and populate the second Student object
        Student28 student2 = new Student28();
        student2.id = scanner.nextInt();
        student2.name = scanner.next();
        student2.javaScore = scanner.nextInt();

        // Display both records
        System.out.println(student1.id + " - " + student1.name + " - " + student1.javaScore);
        System.out.println(student2.id + " - " + student2.name + " - " + student2.javaScore);

        // Compare both scores
        if (student1.javaScore > student2.javaScore) {
            System.out.println(student1.name + " has the higher Java score.");
        } else if (student2.javaScore > student1.javaScore) {
            System.out.println(student2.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }
    }
}