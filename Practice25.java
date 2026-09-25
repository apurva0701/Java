import java.util.Scanner;

public class Practice25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int sum = first + second;

        System.out.println("Sum: " + sum);

        scanner.close();
    }
}