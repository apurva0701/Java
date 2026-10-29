import java.util.Scanner;

class Practice116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuilder message = new StringBuilder("Hello");
        message.append(" ").append(word);

        System.out.println(message.toString().equals("Hello Java"));

        sc.close();
    }
}