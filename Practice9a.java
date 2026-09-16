// public class Practice9a {
//     public static void main(String[] args) {

//         boolean ticketPresent = true;
//         int age = 20;

//         if (ticketPresent) {
//             if (age >= 18) {
//                 System.out.println("Watch movie");
//             } else {
//                 System.out.println("Too young");
//             }
//         } else {
//             System.out.println("Buy ticket");
//         }
//     }
// }

public class Practice9a {
    public static void main(String[] args) {

        boolean ticketPresent = true;
        int age = 20;

        if (ticketPresent && age >= 18) {
            System.out.println("Watch movie");
        } else if (age < 18) {
            System.out.println("Too young");
        } else {
            System.out.println("Buy ticket");
        }
    }
}