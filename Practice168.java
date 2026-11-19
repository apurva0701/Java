
import java.util.*;

class Book {
    private String isbn;

    Book(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Book))
            return false;
        Book b = (Book) obj;
        return Objects.equals(isbn, b.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}

class Practice168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book first = new Book(sc.nextLine());
        Book second = new Book(sc.nextLine());

        System.out.println(first.equals(second));

        sc.close();
    }
}
