// this calculator can read user input; width and height
import java.util.Scanner; // import the Scanner package
public class SquareCalculatorExt {
    public static void main(String[] args) {
        // this is a square calculator, calculate area of rectangle
        // crate a scanner object called reader
        Scanner reader = new Scanner(System.in);
        System.out.println("This is a rectangle calculator.");
        System.out.println("Enter the width = ");
        double width = reader.nextDouble();
        System.out.println("Enter the height = ");
        double height = reader.nextDouble();
        System.out.println("The height is " + height + " and the width is " + width);

        //calculate perimeter = 2 (width + height), and print
        double perimeter = 2*(width+height);
        System.out.println("The perimeter of the rectangle is " + perimeter);

        // calculate area = width * height, and print
        double area = width*height;
        System.out.println("The area of the rectangle is " + area);
    }
}
