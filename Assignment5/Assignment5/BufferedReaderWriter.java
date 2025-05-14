import java.io.*;
class BufferedReaderWriter
{
    public static void main(String args[]) throws Exception
    {


        String s="The FileWriter class of the java.io package can be used to write data (in characters) to files.";

        FileWriter fw=new FileWriter("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/filereaderwriter.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        
        fw.write(s);
        fw.close();
      

        FileReader fr=new FileReader("/home/rasikab/Desktop/JavaProgramming/Assignment5/TextFiles/filereaderwriter.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println("Is there data in the stream? :"+br.ready());
        System.out.println("Data in the Stream:");

        // int i=0;
        // while((i=br.read())!=-1)
        // {
        //     System.out.print((char)i);
        // }


        //read all the content
        System.out.println(br.readLine());
         
        
        
        br.close();

    }
}