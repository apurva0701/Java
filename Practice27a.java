import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double javaScore;
}

public class Practice27a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two Student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Read and store first student
        student1.id = scanner.nextInt();
        student1.name = scanner.next();
        student1.course = scanner.next();
        student1.javaScore = scanner.nextDouble();

        // Read and store second student
        student2.id = scanner.nextInt();
        student2.name = scanner.next();
        student2.course = scanner.next();
        student2.javaScore = scanner.nextDouble();

        // Display first student
        System.out.println("Student 1");
        System.out.println("ID: " + student1.id);
        System.out.println("Name: " + student1.name);
        System.out.println("Course: " + student1.course);
        System.out.println("Java Score: " + student1.javaScore);

        // Display second student
        System.out.println("Student 2");
        System.out.println("ID: " + student2.id);
        System.out.println("Name: " + student2.name);
        System.out.println("Course: " + student2.course);
        System.out.println("Java Score: " + student2.javaScore);
        scanner.close();
    }
}