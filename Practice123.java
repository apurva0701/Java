import java.util.Scanner;

class Learner {
    static int count = 0;

    Learner() {
        count++;
    }
}

class Practice123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Learner obj = new Learner();
        }

        System.out.println(Learner.count);

        sc.close();
    }
}