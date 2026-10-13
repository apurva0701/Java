import java.util.Scanner;

class Student {
    int mark; // Instance variable

    void showFinalMark(int bonus) { // Parameter variable
        int finalMark = mark + bonus; // Local variable

        System.out.println(mark);
        System.out.println(finalMark);
    }
}

public class Practice41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.mark = scanner.nextInt();
        int bonus = scanner.nextInt();

        student.showFinalMark(bonus);

        scanner.close();
    }
}