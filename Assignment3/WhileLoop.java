import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPin = "1234";
        String pin = "";

        while (!pin.equals(correctPin)) {
            System.out.print("Enter ATM PIN: ");
            pin = sc.nextLine();
        }

        System.out.println("PIN accepted..");
      
    }
}
