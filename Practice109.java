import java.util.Scanner;

class Practice109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuilder heading = new StringBuilder(word);

        heading.append(" Course");
        System.out.println(heading);

        heading.insert(0, "Core ");
        System.out.println(heading);

        heading.replace(0, 4, "New ");
        System.out.println(heading);

        heading.delete(0, 4);
        System.out.println(heading);

        sc.close();
    }
}