import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int balance = 5000;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance:" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }

       
    }
}
