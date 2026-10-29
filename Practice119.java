import java.util.Scanner;

class Practice119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String course = sc.nextLine();
        String status = sc.nextLine();

        StringBuilder report = new StringBuilder();
        report.append("Student: ").append(name).append("\n");
        report.append("Course: ").append(course).append("\n");
        report.append("Status: ").append(status);

        System.out.println(report.toString());

        sc.close();
    }
}