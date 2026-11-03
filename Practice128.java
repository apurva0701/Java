import java.util.Scanner;

class Calculator {
    static int square(int n) {
        return n * n;
    }
}

class Practice128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(Calculator.square(n));

        sc.close();
    }
}