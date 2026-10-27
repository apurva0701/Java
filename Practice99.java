import java.util.Scanner;

class Practice99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String reverse = "";

        for (int index = word.length() - 1; index >= 0; index--) {
            reverse += word.charAt(index);
        }

        System.out.println(word.equals(reverse));
        sc.close();
    }
}