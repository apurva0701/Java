import java.util.Scanner;

class Member {
}

class PremiumMember extends Member {
    void showBenefit() {
        System.out.println("Benefit: Priority support");
    }
}

class Practice159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();

        Member member;
        if (role.equals("PREMIUM")) {
            member = new PremiumMember();
        } else {
            member = new Member();
        }

        if (member instanceof PremiumMember) {
            PremiumMember premium = (PremiumMember) member;
            premium.showBenefit();
        } else {
            System.out.println("Standard membership");
        }

        sc.close();
    }
}