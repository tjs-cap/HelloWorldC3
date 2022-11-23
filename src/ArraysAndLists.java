import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysAndLists {
    public static void main(String[] args) {
//        float[] myList = {1.9f,2.9f,3.4f,3.5f};
//        for (float i : myList) {
//            System.out.println(i + " ");
//        }

//        int[][] a = {{1,-2,3},{-4,-5,6,9},{7}};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }

//        String[] users = new String[10];
//        // String[] users = { ... };
//        users[0] = "Trevor";
//        users[1] = "Amy";
//        users[0] = "Josh";

        //Creating an ArrayList and populating it
        ArrayList<String> aList = new ArrayList<>();
        aList.add("Trevor");
        aList.add("Amy");
        aList.add("Josh");
        System.out.println("Original Data: " + aList);

        // Do not do this
        ArrayList<String> backup1 = aList;

        //Creating another arraylist cloning the original
        ArrayList<String> backup2 = (ArrayList<String>)aList.clone();
        
        //Creating another arraylist copying the contents from the original
        ArrayList<String> backup3 = new ArrayList<>();
        for (String value: aList)
        {
            backup3.add(value);
        }

        aList.add("Hassan");
        aList.remove("Trevor");

        System.out.println("aList:   " + aList);
        System.out.println("Backup1: " + backup1);
        System.out.println("Backup2: " + backup2);
        System.out.println("Backup3: " + backup3);
    }
}

