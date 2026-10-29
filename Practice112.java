import java.util.Scanner;

class Practice112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char replacement = sc.nextLine().charAt(0);

        StringBuilder sb = new StringBuilder(word);
        sb.setCharAt(sb.length() - 1, replacement);

        System.out.println(sb);
        sc.close();
    }
}