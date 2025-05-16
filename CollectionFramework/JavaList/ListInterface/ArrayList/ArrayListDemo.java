import java.util.*;
class ArrayListDemo
{
     public static void main(String args[])
     {
        ArrayList<String> al=new ArrayList<>(); //default capacity -10

        // add elements using add()
        
        al.add("Java Programming");
        al.add("C++");
        al.add("C");
        al.add("Python");

        System.out.println(al);

        //add element at specified index

        al.add(1,"MySQL");
        System.out.println(al);

        //add set of elements from one arraylist to another using addAll()

        ArrayList<String> newl=new ArrayList<>();
        newl.addAll(al);
        System.out.println(newl);
            
    
       //get the element using get()
       System.out.println(al.get(1));


       //change the elements using set()
       al.set(2,"C sharp");
       System.out.println(al);


       //remove one element
       al.remove(2);
       System.out.println(al);

       //remove all elements using removeAll()
       al.removeAll(al);
       System.out.println(al);

      //   //clear()
      //   newl.clear();
      //   System.out.println(newl);


      //iterator()
      System.out.println("Using iterator:");
      Iterator i=newl.iterator();

      while(i.hasNext())
         System.out.println(i.next());

      
      //for each loop
      System.out.println("Using for each loop:");
      for(String s:newl)
      {
         System.out.println(s);
      }




      //if we don't specify the data type we can add any data type to it and it only iterator through iterator
      ArrayList l=new ArrayList<>();
      l.add(10);
      l.add("java");
      l.add(9.0);
        
      System.out.print(l);


     }
}