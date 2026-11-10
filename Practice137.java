import java.util.Scanner;

class Student {
    private int age = 18;

    public void setAge(int value) {
        if (value >= 5 && value <= 100) {
            age = value;
        }
    }

    public int getAge() {
        return age;
    }
}

class Practice137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int proposed = sc.nextInt();

        Student student = new Student();
        student.setAge(proposed);

        System.out.println("Age: " + student.getAge());

        sc.close();
    }
}