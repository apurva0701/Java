import java.util.Scanner;

class Practice110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String replacement = sc.nextLine();

        StringBuilder sb = new StringBuilder(word);
        sb.replace(0, 1, replacement);
        System.out.println(sb);
        sc.close();
    }
}