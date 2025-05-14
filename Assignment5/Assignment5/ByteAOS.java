
import java.io.*;
public class ByteAOS
{
    public static void main(String args[])
	{
		try
		{
			FileOutputStream f1=new FileOutputStream("sample.txt"); //f1 that opens (or creates) the file sample.txt for writing

			ByteArrayOutputStream baos=new ByteArrayOutputStream(); //stores data in a byte array internally (in memory).

            String s="The ByteArrayOutputStream class of the java.io package can be used to write an array of output data (in bytes).";

			byte[] b=s.getBytes(); //s into a byte array 
			baos.write(b);      //write the byte data into memory
			baos.writeTo(f1); //writing the byte data to sample.txt.

			baos.flush();  //When you’ve written data but want to make extra sure it’s actually sent 
			baos.close();
		}
		catch(Exception e)
		{
			
		}
	}
}

		