import java.util.*;
class StringDemo
{
    public static void main(String args[])
    {

        //String by literal are stored in string constant pool
        String s="Welcome";
        String s1="Welcome";
        System.out.println(s==s1); //== check the value as well as reference 


        //String by new keyword are stored in heap memory  but in it if the string is already available it creates a new references only

        String str=new String("Welcome");
        String str1=new String("Welcome");
        System.out.println(str==str1);  //it shows false
 
       
        //if we check the string literal and string using new keyword it shows false because both are pointing different reference

        System.out.println(s==str1);   //false


        //To solve this issue we use intern() it check the string is available in string constant pool

        String str2=new String("Welcome").intern();

        System.out.println(s==str2);

         
          //checking the ms that the code will excute
       
          long stime=System.currentTimeMillis();
          StringBuilder sb1=new StringBuilder("welcome to");
          for(int i=0;i<1000000;i++)
          {
            sb1.append("iexceed");
          }
          System.out.println("String Builder");
          System.out.println(System.currentTimeMillis()-stime+"ms");
 
          long stime1=System.currentTimeMillis();
          StringBuffer sb2=new StringBuffer("welcome to");
          for(int i=0;i<1000000;i++)
          {
            sb2.append("iexceed");
          }
          System.out.println("String Buffer");
          System.out.println(System.currentTimeMillis()-stime1+"ms");
 
 


    }
}
