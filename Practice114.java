import java.util.Scanner;

class Practice114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        StringBuilder sb = new StringBuilder(code);
        sb.deleteCharAt(0);

        System.out.println(sb);

        sc.close();
    }
}