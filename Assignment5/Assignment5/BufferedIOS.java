import java.io.*;
class BufferedIOS
{
        public static void main(String args[]) throws Exception
        {
            
            FileOutputStream fos=new FileOutputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/buffer.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String s="The BufferedInputStream class of the java.io package is used with other input streams to read the data (in bytes) more efficiently.";

            byte b[]=s.getBytes();

            bos.write(b);
            bos.close();


           FileInputStream fis=new FileInputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/buffer.txt");
           BufferedInputStream bis = new BufferedInputStream(fis);

           System.out.println("Hom many bytes are available:"+bis.available()); //print no.of items available in the byte array
         
           bis.skip(2);// it skip the first 2 byte item
           System.out.print((char)bis.read());
           System.out.println();
         
         
            
           
            //it will read 3 values

            System.out.println("While Loop Iteration:");
            
            int i=0;
            while((i=bis.read())!=-1)
            {
              System.out.print((char)i);
            }
            

        }
}