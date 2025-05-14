import java.io.*;
class FileCreation
{
     public static void main(String args[]) throws Exception
     {
        File f1=new File("file.txt");
        boolean b=f1.createNewFile();

        if(b)
        {
            System.out.println("New file is Created");
        }
        else
        {
            System.out.println("The file is already available");
        }

        System.out.println("Name of the File:"+f1.getName());
        System.out.println("Is Absolute:"+f1.isAbsolute());
        System.out.println("Path:"+f1.getAbsolutePath());

        boolean fexis=f1.exists();

        if(fexis) 
        {
             System.out.println("Is it readable?:"+f1.canRead());
            System.out.println("Is it writeable?:"+f1.canWrite());
        }

        f1.delete();
        System.out.println("File exists:"+f1.exists());
       
     }
}