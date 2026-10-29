import java.util.Scanner;

class Practice120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append("Participants: ").append(first).append(", ").append(second);

        System.out.println(sb.toString());
        sc.close();
    }
}