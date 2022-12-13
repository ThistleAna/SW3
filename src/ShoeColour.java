import java.util.Scanner;
public class ShoeColour {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);

        System.out.println("Enter colour = ");
        String ShoeColour = reader.nextLine(); // input is string

        System.out.println("You have entered = " + ShoeColour);

        if ((ShoeColour.equals("Brown")) || (ShoeColour.equals("Black"))) { // use .equals() method to compare
            System.out.println("correct");
        }
        else {
            System.out.println("not correct");
        }

    }
}
