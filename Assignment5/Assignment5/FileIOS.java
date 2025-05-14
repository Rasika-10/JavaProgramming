import java.io.*;
class FileIOS
{
        public static void main(String args[]) throws Exception
        {
            
            FileOutputStream fos=new FileOutputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/fios.txt");

            String s="The FileOutputStream class of the java.io package can be used to write data (in bytes) to the files.";

            byte b[]=s.getBytes();

            fos.write(b);
            fos.close();


        FileInputStream fis=new FileInputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/fios.txt");

         System.out.println("Hom many bytes are available:"+fis.available()); //print no.of items available in the byte array
         
         fis.skip(2);// it skip the first 2 byte item
         System.out.print((char)fis.read());
         System.out.println();
         
         
        
         //for loop iteration
         //it will read 3 values

         System.out.println("For Loop Iteration:");
         
        int i=0;
         while((i=fis.read())!=-1)
         {
           System.out.print((char)i);
         }
         

        }
}