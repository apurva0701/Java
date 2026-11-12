import java.util.Scanner;

class Book {
    void showTitle(String title) {
        System.out.println("Book: " + title);
    }
}

class TextBook extends Book {
}

class Practice157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        Book book = new TextBook();
        book.showTitle(title);

        sc.close();
    }
}