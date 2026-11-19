import java.util.Scanner;

class ScoreBox {
    int value;

    ScoreBox(int value) {
        this.value = value;
    }
}

class Practice169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        final int LIMIT = 3;
        final ScoreBox box = new ScoreBox(0);

        box.value = input;

        System.out.println("Limit: " + LIMIT);
        System.out.println("Value: " + box.value);

        sc.close();
    }
}
