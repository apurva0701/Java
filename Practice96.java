import java.util.Scanner;

class Practice96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int index = word.length() - 1; index >= 0; index--) {
            System.out.print(word.charAt(index));
        }

        System.out.println();
        sc.close();
    }
}