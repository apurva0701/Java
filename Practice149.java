import java.util.Scanner;

class Employee {
    private int id;

    Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class Developer extends Employee {
    private String language;

    Developer(int id, String language) {
        super(id);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}

class Practice149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        String language = sc.nextLine();

        Developer dev = new Developer(id, language);

        System.out.println("ID: " + dev.getId());
        System.out.println("Language: " + dev.getLanguage());

        sc.close();
    }
}