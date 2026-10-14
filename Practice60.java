import java.util.Scanner;

public class Practice60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[3];

        marks[0] = scanner.nextInt();
        marks[1] = scanner.nextInt();
        marks[2] = scanner.nextInt();

        System.out.println(marks[1]);

        scanner.close();
    }
}