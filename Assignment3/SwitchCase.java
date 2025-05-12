import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an item:");
        System.out.println("1. Tea");
        System.out.println("2. Coffee");
        System.out.println("3. Juice");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Tea.");
                break;
            case 2:
                System.out.println("You selected Coffee.");
                break;
            case 3:
                System.out.println("You selected Juice.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        
    }
}
