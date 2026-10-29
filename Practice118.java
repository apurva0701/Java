import java.util.Scanner;

class Practice118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        StringBuilder result = new StringBuilder(name);
        result.reverse();

        System.out.println(result.toString());

        sc.close();
    }
}