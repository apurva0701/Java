import java.util.Scanner;

class Practice95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        if (type.equals("staff")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}