import java.util.Scanner;

class Student {
    private int marks;

    public void setMarks(int value) {
        marks = value;
    }

    public int getMarks() {
        return marks;
    }
}

class Practice135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        Student student = new Student();
        student.setMarks(value);

        System.out.println("Marks: " + student.getMarks());

        sc.close();
    }
}