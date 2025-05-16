import java.util.*;
class ArrayListPerformance
{
     public static void main(String args[])
     {
      
        ArrayList<Integer> al=new ArrayList<>(); 

        for(int i=0;i<10000;i++)
        {
            al.add(i);
        }

        long startTime=System.nanoTime();
        for(int i=0;i<10000;i++)
        {
           int n=al.get(i);
        } 
        long endTime=System.nanoTime();

        long d=(endTime-startTime);

        System.out.println("For Loop excution time:"+d);



        Iterator<Integer> itr=al.iterator();
        long startTime1=System.nanoTime();
        
        while(itr.hasNext())
        {
           int n=itr.next();
        }
        
        long endTime1=System.nanoTime();

        long d1=(endTime1-startTime1);

        System.out.println("Iterator excution time:"+d1);
        

     }
}


