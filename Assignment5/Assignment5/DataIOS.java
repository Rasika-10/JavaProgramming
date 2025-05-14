import java.io.*;

class DataIOS
{
     public static void main(String args[]) throws Exception
     {
       
            FileOutputStream fos=new FileOutputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/dios.txt");
            DataOutputStream dos=new DataOutputStream(fos);
            
            //first we write the int then only we write the object
            dos.writeInt(5);
            dos.writeBoolean(true);
            dos.writeDouble(2.0);
         
            dos.close();
       
            FileInputStream fis=new FileInputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/dios.txt");
            DataInputStream dis=new DataInputStream(fis);
            
            System.out.println("Integer:"+dis.readInt());
            System.out.println("Boolean:"+dis.readBoolean());
            System.out.println("Double:"+dis.readDouble());

           
            dis.close();


           DataInputStream din=new DataInputStream(System.in); 
           int n=Integer.parseInt(din.readLine());
           System.out.println(n);

           int num=Integer.valueOf(din.readLine()).intValue();
           System.out.println(num);
            
         

     }


}


