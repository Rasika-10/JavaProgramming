class StringBuilderMethods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Data Structures ");
        System.out.println("Initial String: " + sb);

        // Append a string
        sb.append("are important.");
        System.out.println("After append: " + sb);

        // Insert a substring at a specific position
        sb.insert(5, "and Algorithms ");
        System.out.println("After insert: " + sb);

        // Replace a substring with another string
        sb.replace(0, 4, "All");
        System.out.println("After replace: " + sb);

        // Delete a substring 
        sb.delete(4, 15);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Get the current capacity
        int capacity = sb.capacity();
        System.out.println("Current capacity: " + capacity);

        // Get the length
        int length = sb.length();
        System.out.println("Current length: " + length);

        // Access a character at a specific index
        char ch = sb.charAt(5);
        System.out.println("Character at index 5: " + ch);

        // Set a character at a specific index
        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        // Get a substring from the StringBuilder
        String substring = sb.substring(5, 10);
        System.out.println("Substring: " + substring);

        // Find the index of a specific substring
        StringBuilder s1 = new StringBuilder("..Java is fun. Java is powerful.");
        int i = s1.indexOf("Java");
        System.out.println("Index: " + i);

        // Delete a character at a specific index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // Convert the StringBuilder to a String
        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}
