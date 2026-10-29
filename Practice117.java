import java.util.Scanner;

class Practice117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        StringBuilder result = new StringBuilder(text);
        result.reverse();

        System.out.println(result.toString());

        sc.close();
    }
}