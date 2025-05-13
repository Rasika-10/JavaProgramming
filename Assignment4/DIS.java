import java.io.DataInputStream;

class DIS {
    public static void main(String args[]) {
        new Sample();
    }
}

class Sample {
    DataInputStream din = new DataInputStream(System.in);

    Sample() 
	{
        try {
            System.out.print("Thread\n");
            int n = Integer.parseInt(din.readLine());
			String s=din.readLine();
            System.out.println("Number:"+n);
			System.out.println("Name:"+s);
        } 
		catch (Exception e) 
		{
      
        }
    }
}
