import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    public void setName(String value) {
        name = value;
    }

    public void setMarks(int value) {
        marks = value;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Practice132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int marks = sc.nextInt();

        Student student = new Student();

        student.setName(name);
        student.setMarks(marks);

        System.out.println("Student: " + student.getName());
        System.out.println("Marks: " + student.getMarks());

        sc.close();
    }
}