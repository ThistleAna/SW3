public class SquareCalculator {
    public static void main(String[] args) {
        // this is a square calculator, calculate area of rectangle
        // start your program here
        System.out.println("This is a rectangle calculator.");
        double width = 13.5;
        double height = 25.3;
        System.out.println("The height is " + height + " and the width is " + width);

        //calculate perimeter = 2 (width + height), and print
        double perimeter = 2*(width+height);
        System.out.println("The perimeter of the rectangle is " + perimeter);

        // calculate area = width * height, and print
        double area = width*height;
        System.out.println("The area of the rectangle is " + area);
    }
}
