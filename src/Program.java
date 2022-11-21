import org.openjdk.jol.vm.VM;

public class Program {
    public static void main(String[] args) {

        int age = 45;
        int age1 = 45;
        Integer age2 = new Integer(45);

        //name1 is a string for Fred
        String name1 = "Fred";
        String name2 = "Fred";
        String name3 = "Barney";
        String name4 = "Fred";
        String name5 = "Fred";
        String name6 = new String("Fred");

        //This line is comparing two strings
        System.out.println(name1.equals(name6));

        //This block of code is providing memory addresses for all variables listed
        System.out.println("The memory for age is: " + VM.current().addressOf(age));
        System.out.println("The memory for age1 is: " + VM.current().addressOf(age1));
        System.out.println("The memory for age2 is: " + VM.current().addressOf(age2));

        System.out.println("The memory for name1 is: " + VM.current().addressOf(name1));
        System.out.println("The memory for name2 is: " + VM.current().addressOf(name2));
        System.out.println("The memory for name3 is: " + VM.current().addressOf(name3));
        System.out.println("The memory for name4 is: " + VM.current().addressOf(name4));
        System.out.println("The memory for name5 is: " + VM.current().addressOf(name5));
        System.out.println("The memory for name6 is: " + VM.current().addressOf(name6));
    }
}
