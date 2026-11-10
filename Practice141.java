import java.util.Scanner;

class Student {
    private int marks = 50;

    public void setMarks(int proposed) {
        if (proposed >= 0 && proposed <= 100) {
            marks = proposed;
        }
    }

    public int getMarks() {
        return marks;
    }
}

class Practice141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        Student student = new Student();
        student.setMarks(input);

        System.out.println("Marks: " + student.getMarks());

        sc.close();
    }
}