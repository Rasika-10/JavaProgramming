public class Array {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88}; 

        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}
