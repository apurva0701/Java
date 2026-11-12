import java.util.Scanner;

class Device {
    String label = "Device";
}

class Phone extends Device {
    String label;

    void setLabel(String value) {
        label = value;
    }

    void showParent() {
        System.out.println("Parent: " + super.label);
    }
}

class Practice152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Phone phone = new Phone();
        phone.setLabel(input);
        phone.showParent();

        sc.close();
    }
}