public class ForLoop {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < days.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + days[i]);
        }
    }
}
