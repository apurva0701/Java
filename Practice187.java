
import java.util.Scanner;

class Team {
    private String name;

    Team(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Player {
    private String name;
    private Team team;

    Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    void showDetails() {
        System.out.println(name + " - " + team.getName());
    }
}

class Practice187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teamName = sc.nextLine();
        String firstName = sc.nextLine();
        String secondName = sc.nextLine();

        Team team = new Team(teamName);

        Player p1 = new Player(firstName, team);
        Player p2 = new Player(secondName, team);

        p1.showDetails();
        p2.showDetails();

        sc.close();
    }
}
