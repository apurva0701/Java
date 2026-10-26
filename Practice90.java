import java.util.Scanner;

class Practice90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        // Find the space and print the first name.
        int spaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0, spaceIndex);

        System.out.println(firstName);

        sc.close();
    }
}