
import java.util.Scanner;

final class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Practice171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        Point p = new Point(x, y);

        System.out.println("Point: " + p.getX() + ", " + p.getY());

        sc.close();
    }
}
