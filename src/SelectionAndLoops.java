import java.math.BigInteger;
import java.util.Scanner;

public class SelectionAndLoops {
    public static void main(String[] args) {
//        int x = 45;
//        int number = -55;
//
//        if (number > 0){
//            System.out.println("The number is positive!");
//        }
//        else if (number > x) {
//            System.out.println("And is larger than x: " + x);
//        }
//        else {
//            System.out.println("I'm a terrible programmer!");
//        }

//        int entry = 0;
//
//        System.out.println("Main Menu");
//        System.out.println("1. Get user");
//        System.out.println("2. Add user");
//        System.out.println("3. Delete user");
//        System.out.println("4. Print user");
//        System.out.println("5. Exit menu");
//        System.out.println();
//
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Enter choice: ");
//        try {
//            entry = reader.nextInt();
//        }
//        catch (Exception e) {
//            System.out.println("Entry not recognised!");
////            System.out.println(e.toString());
//        }
////        int entry = reader.nextInt();
//
////        String entry = "2";
//
//        switch (entry){
//            case 1:
//                System.out.println("Get user");
//                break;
//            case 2:
//                System.out.println("Add user");
//                break;
//            case 3:
//                System.out.println("Delete user");
//                break;
//            case 4:
//                System.out.println("Print user");
//                break;
//            case 5:
//                System.out.println("Exit menu");
//                break;
//            default:
//                System.out.println("Entry not recognised.");
//        }

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i  +" Trevor Smith");
//        }

        //while
        String username;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = reader.nextLine();

        while (username.isEmpty()){
            System.out.print("Enter username: ");
            username = reader.nextLine();
        }

        System.out.println("Username = " + username);

        //do while
//        String username1;
//        Scanner reader = new Scanner(System.in);
//        do {
//            System.out.print("Enter username: ");
//            username1 = reader.nextLine();
//        } while (username.isEmpty());
//
//        System.out.println("Username = " + username);
    }
}

