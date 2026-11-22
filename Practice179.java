import java.util.Scanner;

interface Exportable {
    void export(String title);
}

class TextReport implements Exportable {
    @Override
    public void export(String title) {
        System.out.println("Exported: " + title);
    }
}

public class Practice179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        Exportable report = new TextReport();
        report.export(title);

        sc.close();
    }
}