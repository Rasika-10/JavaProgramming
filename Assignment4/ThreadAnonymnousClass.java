class ThreadAnonymnousClass
{
    public static void main(String args[])
	{
	   new Thread()
	   {
	       public void run()
		   {
		       for(int i=0;i<5;i++)
			      System.out.println(i);
			}
	   }.start();
		
	
	 }
}
	   