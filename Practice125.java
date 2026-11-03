import java.util.Scanner;

class NumberUtils {

    static int add(int a, int b) {
        return a + b;
    }

    static int square(int n) {
        return n * n;
    }
}

class Practice125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(NumberUtils.add(a, b));
        System.out.println(NumberUtils.square(a));

        sc.close();
    }
}