import java.io.*;

class ObjectIOS
{
     public static void main(String args[]) throws Exception
     {
         Mobile m=new Mobile("REdmi",10);  //create object
        
         FileOutputStream fos=new FileOutputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/fos.txt");

         ObjectOutputStream oos=new ObjectOutputStream(fos);

         oos.writeObject(m);
         
         oos.close();


       
         FileInputStream fis=new FileInputStream("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/fos.txt");

         ObjectInputStream ois=new ObjectInputStream(fis);
        
          
         Mobile newm=(Mobile)ois.readObject();
         
         System.out.println("Mobile ID:"+newm.id);
         System.out.println("Mobile name:"+newm.name);

         

         ois.close();
         
         

     }


}
class Mobile implements Serializable
{
      String name;
      int id;
      Mobile(String name,int id)
      {
        this.name=name;
        this.id=id;
      }
}

