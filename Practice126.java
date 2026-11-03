import java.util.Scanner;

class NumberUtils {
    static int doubleNumber(int n) {
        return n * 2;
    }
}

class Practice126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(NumberUtils.doubleNumber(number));

        sc.close();
    }
}