class ThreadDemo
{     //we use for loop in main method and run method but output is unpredictable when using the thread methods
      public static void main(String args[])
	  {
	      Sample s=new Sample();
		  s.start();//it will start thread operations
		 
	      for(int i=0;i<10;i++)
		  {
		     System.out.println("Main:"+i);
		  }
		  
	  }
}

class Sample extends Thread
{
      public void run()
	  {
	      for(int i=0;i<10;i++)
		  {
		     System.out.println("Child:"+i);
		  }
	  }
}