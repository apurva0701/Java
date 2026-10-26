import java.util.Scanner;

class Practice92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        // Print the first three characters.
        System.out.println(code.substring(0, 3));

        sc.close();
    }
}