
import java.util.Scanner;

interface Printable {
    void print(String name);
}

class Certificate implements Printable {
    @Override
    public void print(String name) {
        System.out.println("Certificate: " + name);
    }
}

public class Practice178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Printable item = new Certificate();
        item.print(name);

        sc.close();
    }
}
