import java.util.Scanner;

class Rewards {
    private int points;

    Rewards(int initial) {
        points = initial;
    }

    public void addPoints(int bonus) {
        if (bonus > 0) {
            points = points + bonus;
        }
    }

    public int getPoints() {
        return points;
    }
}

class Practice140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int bonus = sc.nextInt();

        Rewards rewards = new Rewards(start);
        rewards.addPoints(bonus);

        System.out.println("Points: " + rewards.getPoints());

        sc.close();
    }
}