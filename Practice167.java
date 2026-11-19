import java.util.Scanner;
import java.util.Objects;

class Customer {
    private int id;
    private String email;

    Customer(int id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer)) return false;

        Customer other = (Customer) obj;
        return id == other.id && Objects.equals(email, other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}

class Practice167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstId = sc.nextInt();
        sc.nextLine();
        String firstEmail = sc.nextLine();

        int secondId = sc.nextInt();
        sc.nextLine();
        String secondEmail = sc.nextLine();

        Customer first = new Customer(firstId, firstEmail);
        Customer second = new Customer(secondId, secondEmail);

        System.out.println(first.equals(second));

        sc.close();
    }
}