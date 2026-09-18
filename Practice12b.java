public class Practice12b {
    public static void main(String[] args) {
        int total = 0;
        int number = 1;

        do {
            if (number == 3)
                break;
            System.out.println("Number: " + number);
            total += number;
            number++;
        } while (number <= 5);

        System.out.println("Total: " + total);
    }
}

// public class Practice12b {
// public static void main(String[] args) {
// int total = 0;
// int number = 1;

// do {
// if (number == 3) {
// number++;
// continue;
// }

// System.out.println("Number: " + number);
// total += number;
// number++;
// } while (number <= 5);

// System.out.println("Total: " + total);
// }
// }