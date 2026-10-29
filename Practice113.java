import java.util.Scanner;

class Practice113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = sc.nextInt();

        StringBuilder sb = new StringBuilder(word);
        sb.deleteCharAt(index);

        System.out.println(sb);

        sc.close();
    }
}