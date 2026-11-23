import java.util.Scanner;

class Course {
    private String title;

    Course(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}

class Student {
    private String name;
    private Course course;

    Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    void showEnrollment() {
        System.out.println(name + " studies " + course.getTitle());
    }
}

class Practice184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String title = sc.nextLine();

        Course course = new Course(title);
        Student student = new Student(name, course);
        student.showEnrollment();

        sc.close();
    }
}