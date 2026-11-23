
import java.util.Scanner;

class Classroom {
    private String room;

    Classroom(String room) {
        this.room = room;
    }

    String getRoom() {
        return room;
    }
}

class Teacher {
    private String name;
    private Classroom classroom;

    Teacher(String name, Classroom classroom) {
        this.name = name;
        this.classroom = classroom;
    }

    void display() {
        System.out.println("Teacher: " + name + ", Room: " + classroom.getRoom());
    }
}

public class Practice185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String room = sc.nextLine();

        Classroom classroom = new Classroom(room);
        Teacher teacher = new Teacher(name, classroom);
        teacher.display();

        sc.close();
    }
}
