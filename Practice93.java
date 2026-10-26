class Practice93 {
    public static void main(String[] args) {
        // Subtask 1: Compare two String literals
        String first = "Java";
        String second = "Java";
        System.out.println(first == second);

        // Subtask 2: Compare a separately created String
        String third = new String("Java");
        System.out.println(first == third);
        System.out.println(first.equals(third));

        // Subtask 3: Reassign a String reference
        String message = "Hi";
        String original = message;
        message = message + " Java";

        System.out.println(message);
        System.out.println(original);
    }
}