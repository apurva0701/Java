import java.util.Scanner;

class Practice129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.min(a, b));

        sc.close();
    }
}