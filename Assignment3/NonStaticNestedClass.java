class NonStaticNestedClass {
public static void main(String[] args)
{
    Mobile m=new Mobile("Redmi"); 
    Mobile.Details d=m.new Details("MIUI",128); 
    m.display("POCO");
    d.display();
}

}

class Mobile // outer class
{
   String mobile_name;
   Mobile(String mobile_name)
   {  
           this.mobile_name=mobile_name; 
           System.out.println("Mobile cons");
           // ram=124; cannot access the inner class variable outside the class
   }
   public void display(String mobile_name)
   {
       System.out.println("Mobile name: "+mobile_name);
   }

   //non static nested class or inner class 

   class Details
   {
        String type; 
        int ram;
        Details(String type,int ram)
        {
             this.type=type; 
             this.ram=ram;
             System.out.println("Details cons");
        }
        public void display()
        {
             System.out.println("Mobile name: "+mobile_name); 
             System.out.println("Type :"+type);
 
            System.out.println("RAM :"+ram);
        }
    }
}