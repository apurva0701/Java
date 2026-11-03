import java.util.Scanner;

class Calculator {
    static int cube(int n) {
        return n * n * n;
    }
}

class Practice130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(Calculator.cube(n));

        sc.close();
    }
}