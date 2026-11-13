import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Marks: " + marks;
    }
}

class Practice163 {

    static void printSummary(Student student) {
        System.out.println(student);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int marks = sc.nextInt();

        Student student = new Student(name, marks);

        printSummary(student);

        sc.close();
    }
}