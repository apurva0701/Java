
import java.util.Scanner;

abstract class Report {
    abstract void show(String title);
}

class TextReport extends Report {
    @Override
    public void show(String title) {
        System.out.println("Report: " + title);
    }
}

public class Practice177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();

        Report report = new TextReport();
        report.show(title);

        sc.close();
    }
}
