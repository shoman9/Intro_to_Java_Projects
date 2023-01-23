import java.util.Scanner;

public class MondayDemo {
    public static void main(String[] args) {
        // Program to tell if someone's name has an odd or even number of letters

        //Obtain user's name
        Scanner Console = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
String name = Console.next();
        //Count the letters in the name
        int count = name.length();

        //Determine if that number is odd or even

        //Assume everyone's name is odd length
        String parity = "odd";
        if (count % 2 == 0) {
            parity = "even ";
        }

        //Report
    System.out.println("Hi "+ name + ", your name has an " + parity + "number of letters");
    }
}