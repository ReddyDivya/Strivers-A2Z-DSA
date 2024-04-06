//Basic Input and Output
import java.util.Scanner;//import scanner object

public class InputOutput{
    public static void main(String[] args)
    {
        //creating a scanner object for input to read the input from the console
        Scanner scanner = new Scanner(System.in);

        //prompt the user
        System.out.println("Enter your name: ");

        //reading input from the user and storing it in the name variable
        String name = scanner.nextLine();

        //output the input value with greetings
        System.out.println("Hello, "+ name +"!");

        //closing the scanner to release the system resources
        scanner.close();
    }
}