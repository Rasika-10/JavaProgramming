import java.util.LinkedList;
import java.util.Deque;

class LinkedListImplementsDeque
{
  public static void main(String[] args)
  {
    Deque<String> a = new LinkedList<>();

    // add element at the beginning
    a.add("Cow");
    System.out.println("LinkedList: " + a);

    a.addFirst("Dog");
    System.out.println("LinkedList after addFirst(): " + a);

    // add elements at the end
    a.addLast("Zebra");
    System.out.println("LinkedList after addLast(): " + a);

    //get the first element
     System.out.println("Get first element: " + a.getFirst());

      //get the last element
     System.out.println("Get lastt element: " + a.getLast());

    // remove the first element
    a.removeFirst();
    System.out.println("LinkedList after removeFirst(): " + a);

    // remove the last element
    a.removeLast();
    System.out.println("LinkedList after removeLast(): " + a);

    

  }
}