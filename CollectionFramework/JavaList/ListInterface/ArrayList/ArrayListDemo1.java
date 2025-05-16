import java.util.*;
class ArrayListDemo1
{
     public static void main(String args[])
     {
        //if i give initial capacity -3 ..it not means only it contains 3 elements..its only starting size of the array..if we add 4th element it resizing dynamically
        ArrayList<String> al=new ArrayList<>(3); 
     

        // add elements using add()
        
        al.add("Java Programming");
        al.add("C++");
        al.add("C");
        al.add("Python");

        System.out.println(al);
 
       
       //another style of adding elements
    
       ArrayList<String> list=new ArrayList<>()
       {
         {
            add("Java Programming");
            add("C++");
            add("C");
            add("Python");
         }
       };

        System.out.println(list);

        
         //we can also pass the one arraylist to another 
         ArrayList<String> list1=new ArrayList<>(list);
         System.out.println(list1);




         //convertion arraylist to arr
         String str[]=new String[list1.size()];
         list1.toArray(str);
         System.out.println("Arraylist to Array");

         System.out.print("Array:");
         for(int i=0;i<str.length;i++)
         {
            System.out.print(str[i]+" ");
         }
 
         System.out.println();

         System.out.println("Array to ArrayList");
         //converstion arr to arraylisi
          ArrayList<String> newlist=new ArrayList<>(Arrays.asList(str));
          System.out.println(newlist);




        
     }
}
