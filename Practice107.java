import java.util.Scanner;

class Practice107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String course = sc.nextLine();

        StringBuilder message = new StringBuilder();
        message.append("Welcome, ");
        message.append(name);
        message.append("! You joined ");
        message.append(course);
        message.append(".");

        System.out.println(message);

        sc.close();
    }
}