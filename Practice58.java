
import java.util.Scanner;

class Course {
    String name;
    int duration;

    Course() {
        this("Java", 30);
    }

    Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    void display() {
        System.out.println(name + " " + duration);
    }
}

public class Practice58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int duration = scanner.nextInt();

        Course defaultCourse = new Course();
        Course customCourse = new Course(name, duration);

        defaultCourse.display();
        customCourse.display();

        scanner.close();
    }
}
