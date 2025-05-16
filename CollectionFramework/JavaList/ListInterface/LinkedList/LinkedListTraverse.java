import java.util.*;

public class LinkedListTraverse
 {
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Get Spliterator
        Spliterator<String> sp = list.spliterator();

        // Traverse using tryAdvance()
        System.out.println("Using tryAdvance:");
        while(sp.tryAdvance((e)->System.out.println(e)));

        // Create a new Spliterator to demonstrate forEachRemaining
        Spliterator<String> sp2 = list.spliterator();

        // Traverse using forEachRemaining()
        System.out.println("Using forEachRemaining:");
        sp2.forEachRemaining((e) -> System.out.println(e));



        ListIterator itr=list.listIterator();

        while(itr.hasNext())
           System.out.println(itr.next());

        System.out.println("Backward Traverse:");

        //Backward traverse 
         while(itr.hasPrevious())
           System.out.println(itr.previous());


    }
}
