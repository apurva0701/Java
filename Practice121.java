import java.util.Scanner;

class Practice121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();

            if (i > 0) {
                sb.append(", ");
            }

            sb.append(name);
        }

        System.out.println(sb.toString());

        sc.close();
    }
}