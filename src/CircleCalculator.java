public class CircleCalculator {
    public static void main(String[] args) {
        // this is a circle calculator
        double circleRadius = 12.0;

        // calculate the diameter
        double circleDiameter = 2 * circleRadius;
        System.out.println("The diameter is " + circleDiameter);

        // calculate the circumference
        double circumference = 2 * 3.14 * circleRadius;
        System.out.println("The circumference is " + circumference);

        // calculate the area
        double area = 3.14 * circleRadius * circleRadius;
        System.out.println("The area is " + area);
    }
}
