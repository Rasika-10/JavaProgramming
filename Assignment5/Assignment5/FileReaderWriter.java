import java.io.*;
class FileReaderWriter
{
    public static void main(String args[]) throws Exception
    {


        String s="The FileWriter class of the java.io package can be used to write data (in characters) to files.";

        FileWriter fw=new FileWriter("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/filereaderwriter.txt");
        fw.write(s);
        fw.close();
      

        FileReader r=new FileReader("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/filereaderwriter.txt");

        System.out.println("Is there data in the stream? :"+r.ready());
        System.out.println("Data in the Stream:");

        int i=0;
        while((i=r.read())!=-1)
        {
            System.out.print((char)i);
        }
          //get the type of encoding that is used to store data in the file
        System.out.println(r.getEncoding());
        
        r.close();

    }
}