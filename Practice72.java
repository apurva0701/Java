import java.util.Scanner;

class Student {
    String name;
}

public class Practice72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[2];

        for (int index = 0; index < students.length; index++) {
            students[index] = new Student();
            students[index].name = scanner.nextLine();
        }

        for (int index = 0; index < students.length; index++) {
            System.out.println(students[index].name);
        }

        scanner.close();
    }
}