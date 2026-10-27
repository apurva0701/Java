import java.util.Scanner;

class Practice104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char target = sc.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}