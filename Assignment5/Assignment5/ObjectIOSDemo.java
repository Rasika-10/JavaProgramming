import java.io.*;

class ObjectIOSDemo
{
     public static void main(String args[])
     {
            String s="Hello";
            int n=2;
        try
        {
            FileOutputStream fos=new FileOutputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/oiosdemo.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            
            //first we write the int then only we write the object
            oos.writeInt(n);
            oos.writeObject(s);
        

       
            FileInputStream fis=new FileInputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/oiosdemo.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            System.out.println("Integer:"+ois.readInt());
            System.out.println("String:"+ois.readObject());

            oos.close();
            ois.close();
        }
        catch(Exception e){}
         

     }


}


