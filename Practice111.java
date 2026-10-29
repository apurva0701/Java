import java.util.Scanner;

class Practice111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = sc.nextInt();
        char replacement = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(word);
        sb.setCharAt(index, replacement);

        System.out.println(sb);
    }
}