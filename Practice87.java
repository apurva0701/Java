import java.util.Scanner;

public class Practice87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int layers = scanner.nextInt();
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][][] values = new int[layers][rows][columns];

        // Read values
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    values[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Display layer by layer
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    System.out.print(values[i][j][k]);
                    if (k < columns - 1) {
                        System.out.print(" ");
                    }
                }
                if (j < rows - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}