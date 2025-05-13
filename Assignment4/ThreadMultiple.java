class ThreadMultiple
{ 
	
   public static void main(String args[]) throws Exception
   {
      Sample s1=new Sample(); 
	  s1.start();
	  s1.join(); 
	   
	  Sample1 s2=new Sample1(); 
	  s2.start();
	
	 
	  
   }
}
class Sample extends Thread
{
   public void run()
   {
          System.out.println("Sample");
          for(int i=0;i<5;i++)
		  {
		       System.out.println(i);
		  }
  }
}

class Sample1 extends Thread
{
   public void run()
   {
          System.out.println("Sample1");
          for(int i=0;i<5;i++)
		  {
		       System.out.println(i);
		  }
  }
}

 
 