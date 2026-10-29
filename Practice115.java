import java.util.Scanner;

class Practice115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        StringBuilder sb1 = new StringBuilder(first);
        StringBuilder sb2 = new StringBuilder(second);

        System.out.println(sb1.toString().equals(sb2.toString()));

        sc.close();
    }
}