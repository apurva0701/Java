import java.util.Scanner;

class Person {
    void showName(String name) {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    void showCourse(String course) {
        System.out.println("Course: " + course);
    }
}

class ProjectStudent extends Student {
    void showProject(String project) {
        System.out.println("Project: " + project);
    }
}

class Practice146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String course = sc.nextLine();
        String project = sc.nextLine();

        // Create ProjectStudent object
        ProjectStudent student = new ProjectStudent();

        // Call all three methods
        student.showName(name);
        student.showCourse(course);
        student.showProject(project);

        sc.close();
    }
}