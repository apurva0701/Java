import java.util.Scanner;

class Practice101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;

        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}