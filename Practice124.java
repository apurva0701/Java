import java.util.Scanner;

class Book {
    static int count = 0;

    Book() {
        count++;
    }
}

class Practice124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Book obj = new Book();
        }

        System.out.println(Book.count);

        sc.close();
    }
}