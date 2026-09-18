public class Practice13 {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;
        String result;
        if (marks >= 60 && attendance >= 75) {
            result = "Placement Ready";
        } else {
            result = "Continue Preparation";
        }

        System.out.println(result);

        for (int i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day: " + i);
        }
    }
}