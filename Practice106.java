import java.util.Scanner;

class Practice106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuilder builder = new StringBuilder(word);
        System.out.println(builder);

        StringBuilder sameBuilder = builder;
        sameBuilder.append("!");
        System.out.println(builder);

        String saved = builder.toString();
        builder.append("?");
        System.out.println(saved);
        System.out.println(builder);

        sc.close();
    }
}