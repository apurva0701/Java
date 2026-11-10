import java.util.Scanner;

class Book {
    private String title;

    public void setTitle(String value) {
        title = value;
    }

    public String getTitle() {
        return title;
    }
}

class Practice134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        Book book = new Book();
        book.setTitle(title);

        System.out.println("Book: " + book.getTitle());

        sc.close();
    }
}