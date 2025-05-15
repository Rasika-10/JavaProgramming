
class DemoString {
    public static void main(String[] args) {
        
        String s = "HelloWorld";

        // Returns the number of characters in the String
        System.out.println("String length = " + s.length());

        // Returns the character at specified index
        System.out.println("Character at 3rd position = " + s.charAt(3));

        // Return the substring from the ith index character to end of string
        System.out.println("Substring from 3rd position = " + s.substring(3));

        // Returns the substring 
        System.out.println("Substring from index 2 to 5 = " + s.substring(2, 5));

        // Concatenates string2 to the end of string1
        String s1 = "Hello";
        String s2 = "Java";
        System.out.println("Concatenated string = " + s1.concat(s2));

        // Returns the index within the string of the first occurrence of the specified string
        String s4 = "Code Learn Code";
        System.out.println("Index of Learn = " + s4.indexOf("Learn"));

        // Returns the index within the string of the first occurrence of a character from a given index
        System.out.println("Index of e after position 3 = " + s4.indexOf("Code", 3));

        // Checking equality of Strings
        Boolean out = "Hello".equals("hello");
        System.out.println("Checking Equality (case-sensitive): " + out);
        out = "Hello".equals("Hello");
        System.out.println("Checking Equality (exact match): " + out);

        //false because extra space
        out = "Hello".equalsIgnoreCase("heLLo ");
        System.out.println("Checking Equality (ignore case): " + out);

        out = "Hello".equalsIgnoreCase("heLLo");
        System.out.println("Checking Equality (ignore case): " + out);

        // If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("ASCII diff:"+out1);

        // Converting cases
        String w1 = "MyJavaApp";
        System.out.println("Changing to lower case: " + w1.toLowerCase());

        String w2 = "myjavaapp";
        System.out.println("Changing to UPPER case: " + w2.toUpperCase());

        // Trimming the word (remove the space before and after the string )
        String w4 = "  Welcome to Java  ";
        System.out.println("Trimmed string:"+ w4.trim() );

        // Replacing characters
        String str1 = "banana";
        System.out.println("Original String: " + str1);
        String str2 = str1.replace('a', 'o');
        System.out.println("Replaced 'a' with 'o': " + str2);
    }
}
