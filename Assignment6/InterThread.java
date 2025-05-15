import java.util.*;
class InterThread
{
     public static void main(String args[])
     {
         Buyer b=new Buyer();

         new Thread()
         {
            public void run()
            {
                b.processPayment();
            }
         }.start();

         new Thread()
         {
            public void run()
            {
                b.addToCart("Shoe",599.0);
            }
         }.start();

         new Thread()
         {
            public void run()
            {
                b.addToCart("Lap",1000000);
                b.addComplete();
            }
         }.start();

          new Thread()
         {
            public void run()
            {
                b.addToCart("Lotion",100);
                b.addComplete();
            }
         }.start();
     } 
}


class Buyer
{
     HashMap<String,Double> map=new HashMap<>();
     boolean status=false;
     static int i=0;
    
     synchronized public void addToCart(String item,double price)
     {
         map.put(item,price);
         System.out.println("Item "+i+" :"+item);
         System.out.println("Price:"+price);
         i++;
         notify();
       
     }
    
     synchronized public void addComplete()
     {
        status=true;
        notifyAll();
     }
 
     synchronized public void  processPayment()
     {
         while(map.isEmpty())
         {  
            System.out.println("Cart is Empty..");
            try
            {
                wait();
            }
            catch(Exception e)
            {

            }
            
         }
         while(!status)
         {   
            System.out.println("Waiting for the items to be added in the cart..");
            try
            {
                wait();
            }
            catch(Exception e)
            {

            }
            
         }

         System.out.println("All Items are added to the cart.Processing payment...");

         double total=0;
         for(Map.Entry<String,Double> e : map.entrySet())
         {
            double price=e.getValue();
            total+=price;
         }

         System.out.println("Total price:"+total);
         System.out.println("Payment Processed Successfully!!..");
     }
}