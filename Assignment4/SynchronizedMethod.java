class SynchronizedMethod
{
     public static void main(String args[])
	 {
	        
		Sample s=new Sample();
		Sample1 s1=new Sample1(s,"HI");
		Sample1 s2=new Sample1(s,"Welcome");
		Sample1 s3=new Sample1(s,"Hello");
	 } 
}

class Sample 
{
     synchronized public void call(String msg)
	 {
	     System.out.print(msg);
		 System.out.print("!!!");
		 System.out.print("...");
	 }
}

class Sample1 extends Thread
{
     Thread t=new Thread(this);
	 Sample s;
	 String msg;
	 Sample1(Sample s,String msg)
	 {
	     this.s=s;
		 this.msg=msg;
	     t.start();
	 }
	 
	 public void run()
	 {
	     s.call(msg);
	}
}

		 
