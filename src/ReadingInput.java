import java.util.Scanner; // importing Scanner class to read user input
public class ReadingInput {
    public static void main(String[] args) { // this is main method
        System.out.println("This program can read user input");
        Scanner myObj = new Scanner(System.in);    // create Scanner object

        System.out.println("Enter username = ");
        String username = myObj.nextLine(); // user enter the value of username


        // read user password
        System.out.println("Enter password = ");
        String password = myObj.nextLine(); // user enter the value of username

        System.out.println("Your username is " +username);
        System.out.println("Your password is " + password);
    }
}



