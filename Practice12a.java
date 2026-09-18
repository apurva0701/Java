public class Practice12a {
    public static void main(String[] args) {
        int total = 0;
        int number = 1;

        while (number <= 5) {
            if (number == 3)
                break;
            System.out.println("Number: " + number);
            total += number;
            number++;
        }

        System.out.println("Total: " + total);
    }
}

// public class Practice12a {
// public static void main(String[] args) {
// int total = 0;
// int number = 1;

// while (number <= 5) {
// if (number == 3) {
// number++;
// continue;
// }

// System.out.println("Number: " + number);
// total += number;
// number++;
// }

// System.out.println("Total: " + total);
// }
// }