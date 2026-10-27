import java.util.Scanner;

class Practice102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }

        sc.close();
    }
}