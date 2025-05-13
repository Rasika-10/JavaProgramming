class ThreadNaming
{
   public static void main(String args[])
   {
       new Sample();
	   Thread t=Thread.currentThread();
	   t.setName("Main Thread");
	   System.out.println(t.getName());
	   
	
   }
 }
 
 class Sample extends Thread
 {
     
     Sample()
	 {
	     Thread t=new Thread(this);
		 t.setName("Sample Thread");
		 System.out.println(t.getName());
	 }
 }