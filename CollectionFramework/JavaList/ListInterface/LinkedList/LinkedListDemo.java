import java.util.*;

class LinkedListDemo
{
    public static void main(String args[]) {

        // Declare and initialize a LinkedList
        LinkedList<String> al = new LinkedList<>();

        // Add elements using add()
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Date");
        System.out.println(al);  

        // Add element at a specified index
        al.add(1, "Blueberry");
        System.out.println(al);  

        // Add set of elements from one LinkedList to another using addAll()
        LinkedList<String> newl = new LinkedList<>();
        newl.addAll(al);
        System.out.println(newl);  

        // Get the element using get()
        System.out.println("Element at index 1: " + al.get(1));  

        // Change the elements using set()
        al.set(2, "Blackberry");
        System.out.println(al);  

        // Remove one element
        al.remove(2);
        System.out.println(al);  

        // Remove all elements using removeAll()
        al.removeAll(al);
        System.out.println(al); 


        LinkedList<String> loc=new LinkedList<>();
        loc.add("Salem");
        loc.add("Namakkal");
        loc.add("Coimbatore");
        loc.add("Namakkal");
        loc.add("Bangalore");

        //Remove the firstoccurence element
         loc.removeFirstOccurrence("Namakkal");
         System.out.println(loc);

          //Remove the lasstoccurence element
         loc.removeLastOccurrence("Namakkal");
         System.out.println(loc);


         //removeIf() method

         System.out.println("Using removeIf() mehtod removing coimbatore:");
         loc.removeIf(x->x.equals("Coimbatore"));
         System.out.println(loc);



    


        // Using iterator
        System.out.println("Using iterator:");
        Iterator<String> i = newl.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        // For-each loop
        System.out.println("Using for-each loop:");
        for (String s : newl) {
            System.out.println(s);
        }


        //mixed data type
        LinkedList l = new LinkedList(); 
        l.add(100);           
        l.add("Orange");      
        l.add(45.6);          

        System.out.println("Mixed LinkedList: " + l);

          // access the first element
         System.out.println("Accessed First Element: " + l.peekFirst());


        // access the last element
        System.out.println("Accessed Last Element: " + l.peekLast());

       
    }
}
