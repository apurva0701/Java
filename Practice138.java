import java.util.Scanner;

class Rating {
    private int value = 3;

    public void setRating(int proposed) {
        if (proposed >= 1 && proposed <= 5) {
            value = proposed;
        }
    }

    public int getRating() {
        return value;
    }
}

class Practice138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        Rating rating = new Rating();
        rating.setRating(number);

        System.out.println("Rating: " + rating.getRating());

        sc.close();
    }
}