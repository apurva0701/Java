import java.util.Scanner;

class Practice103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        if (first.length() != second.length()) {
            System.out.println(false);
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < first.length(); i++) {
            count[first.charAt(i) - 'a']++;
            count[second.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
        sc.close();
    }
}