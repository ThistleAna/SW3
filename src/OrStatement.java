public class OrStatement {
    public static void main(String[] args) {
        int number = 10; // false

        // logical OR, ||, only if both false the statement is false

        if (number < 0 || number > 100) { // F || F = False
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
