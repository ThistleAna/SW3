public class logicalAnd {
    public static void main(String[] args) {
        int balance = 35000;

        if (balance > 0 && balance < 85001) {
            System.out.println("Congratulation! Your balance amount of " + balance + " is protected.");
        } else {
            System.out.println( " I am sorry your balance is not protected");
        }
    }
}
