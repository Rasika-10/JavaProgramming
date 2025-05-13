class ThreadJoin
{ 
	
   public static void main(String args[]) throws Exception
   {
      Sample s1=new Sample(); //this is 1st thread 
	  s1.start();
	  s1.join();  // join() method ,first fully complete the thread excution then only move to the next thread
	 
	  Sample s2=new Sample();
	  s2.start();
	  s2.join();
	   
	  Sample s3=new Sample();
	  s3.start();
	   
	  //so finally it create 5 thread
   }
}
class Sample extends Thread
{

   //Thread t=new Thread(this);   //this is 2nd thread
   Sample()
   {
	  
	   System.out.println(this.getName());  //this refers to the current Sample thread object.
   }
   public void run()
   {
          for(int i=0;i<5;i++)
		  {
		       System.out.println(i);
		  }
  }
}

 
 