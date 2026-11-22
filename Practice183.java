import java.util.Scanner;

interface Startable {
    void start(String name);
}

interface Stoppable {
    void stop(String name);
}

class Device implements Startable, Stoppable {
    public void start(String name) {
        System.out.println("Started: " + name);
    }

    public void stop(String name) {
        System.out.println("Stopped: " + name);
    }
}

public class Practice183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Device device = new Device();
        device.start(name);
        device.stop(name);

        sc.close();
    }
}