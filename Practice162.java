import java.util.Scanner;

class Report {
    void showReport(String name) {
        System.out.println("Report: " + name);
    }
}

class CsvReport extends Report {
    @Override
    void showReport(String name) {
        System.out.println("CSV report: " + name);
    }
}

class PdfReport extends Report {
    @Override
    void showReport(String name) {
        System.out.println("PDF report: " + name);
    }
}

class Practice162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        String name = sc.nextLine();

        Report report;

        if (type.equals("CSV")) {
            report = new CsvReport();
        } else {
            report = new PdfReport();
        }

        report.showReport(name);

        sc.close();
    }
}