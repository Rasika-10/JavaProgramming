class ThreadPriority extends Thread
{
    
   public void run()
   {
       System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
   }
   public static void main(String args[]) 
   {
     
	   ThreadPriority t1=new ThreadPriority(); //obj for classname
	   t1.setPriority(8);
	   System.out.println(t1.getPriority());
	   
	   t1.setName("Thread 1");
	   
	   
	   
	   ThreadPriority t2=new ThreadPriority();
	   t2.setPriority(6);
	   System.out.println(t2.getPriority());
	   t2.setName("Thread 2");
	   
	   t1.start();
	   t2.start();
	
   }
   
   
  
 }