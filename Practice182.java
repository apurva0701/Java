import java.util.Scanner;

interface Printable {
    void print(String name);
}

interface Saveable {
    void save(String name);
}

class StudentRecord implements Printable, Saveable {
    @Override
    public void print(String name) {
        System.out.println("Printed: " + name);
    }

    @Override
    public void save(String name) {
        System.out.println("Saved: " + name);
    }
}

public class Practice182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        StudentRecord record = new StudentRecord();
        record.print(name);
        record.save(name);

        sc.close();
    }
}