class ThreadSleep
{    
      public static void main(String args[]) throws Exception
	  {
	      Sample s=new Sample();
		  s.start();
		 
		  Thread t=Thread.currentThread();
	      for(int i=0;i<10;i++)
		  {
		     
		      System.out.println("Main:"+i);
			  t.sleep(1000);

		  }
		  
	  }
}

class Sample extends Thread
{

     Thread t=new Thread(this);
      public void run()
	  {
	      for(int i=0;i<10;i++)
		  {
		  
		     try
			 {
		       System.out.println("Child:"+i);
			   t.sleep(1000);
			 }
			 catch(Exception e)
			 {
			 }
			  
		  }
	  }
}