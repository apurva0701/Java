import java.util.Scanner;

class Practice122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String code = sc.next();

            if (i > 0) {
                sb.append(", ");
            }

            sb.append(code);
        }

        System.out.println(sb.toString());

        sc.close();
    }
}