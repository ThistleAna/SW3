
    public class BalanceNotStatement {
        public static void main(String[] args) {
            int balance = 100000;

            if (! (balance > 0 && balance < 85001)) { // with AND both statements must be true to execute the body
                System.out.println( " I am sorry your balance is not protected");
            } else {
                System.out.println("Congratulation! Your balance amount of " + balance + " is protected.");
            }
        }
    }

