import java.util.LinkedList;
import java.util.Queue;

class LinkedListImplementsQueue
{
  public static void main(String[] args) {
    Queue<String> l = new LinkedList<>();

    // add elements
    l.add("India");
    l.add("USA");
    l.add("Canada");
    System.out.println("LinkedList: " + l);

    // access the first element
    String str1 = l.peek();
    System.out.println("Accessed Element: " + str1);

    // access and remove the first element
    String str2 = l.poll();
    System.out.println("Removed Element: " + str2);
    System.out.println("LinkedList after poll(): " + l);

    // add element at the end
    l.offer("Germany");
    System.out.println("LinkedList after offer(): " + l);
  }
}
