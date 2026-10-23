import java.util.Scanner;

public class Practice86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];
        int arrayTotal = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            arrayTotal += arr[i];
        }

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        int matrixTotal = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);

        scanner.close();
    }
}