import java.io.*;
public class ByteAIS
{
     public static void main(String args[]) throws Exception
     {

         byte b[]={70,71,72,73,74,75,76,77};
         ByteArrayInputStream bais =new ByteArrayInputStream(b);
        
        
         System.out.println("Hom many bytes are available:"+bais.available()); //print no.of items available in the byte array
         
         bais.skip(2); // it skip the first 2 byte item
         System.out.println(bais.read()); ///it reads first value
 

         
        
         //for loop iteration
         //it will read 3 values

         System.out.println("For Loop Iteration:");
         for(int i=0;i<b.length-4;i++)
         {
            System.out.println(bais.read());
         }
         

         //only once we can read the all items in the byte array after reading there will be no data to read
         

         //while loop print anything because all the items are read
         //while loop iteration
         
         System.out.println("While Loop Iteration:");
         int i=0;
         //it will read remaining values
         while((i=bais.read())!=-1)
         {
               System.out.println(i);
         }


          System.out.println("Hom many bytes are available:"+bais.available());//after reading all the bytes it will be 0
     }
}