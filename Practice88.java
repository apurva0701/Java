import java.util.Scanner;

public class Practice88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int layers = scanner.nextInt();
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][][] values = new int[layers][rows][columns];

        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    values[i][j][k] = scanner.nextInt();
                }
            }
        }

        for (int i = 0; i < layers; i++) {
            int total = 0;

            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    total += values[i][j][k];
                }
            }

            System.out.println(total);
        }

        scanner.close();
    }
}