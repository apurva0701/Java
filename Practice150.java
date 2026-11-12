import java.util.Scanner;

class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class TextBook extends Book {
    TextBook(String title) {
        super(title);
    }
}

class Practice150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        TextBook book = new TextBook(title);
        System.out.println("Book: " + book.getTitle());

        sc.close();
    }
}