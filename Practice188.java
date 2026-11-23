
import java.util.Scanner;

class Header {
    private String title;

    Header(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}

class Report {
    private Header header;

    Report(String title) {
        this.header = new Header(title);
    }

    void show() {
        System.out.println("Header: " + header.getTitle());
    }
}

class Practice188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        Report report = new Report(title);
        report.show();

        sc.close();
    }
}
