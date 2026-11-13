import java.util.Scanner;

class Ticket {
    private String code;

    Ticket(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Ticket: " + code;
    }
}

class Practice166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket ticket = new Ticket(sc.nextLine());
        System.out.println(ticket);
        sc.close();
    }
}