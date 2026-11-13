import java.util.Scanner;

class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title;
    }
}

class Practice165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = new Book(sc.nextLine());
        System.out.println(book);

        sc.close();
    }
}