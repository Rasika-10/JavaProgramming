class Inheritance
{
      public static void main(String args[])
	  {
	       Redmi r=new Redmi(1,"android","Redmi 10 pro",20000,128);
	       r.display();
	  }
}
class Mobile
{
       int id;
	   String type;
	   String processor="MIUI";
	   Mobile()
	   {
	      System.out.println("Mobile cons");
	   }
	   Mobile(int id,String type)
	   {
	      this();
	      this.id=id;
          this.type=type;
	   }
	   void display()
	   {
	       System.out.println("ID:"+id);
		   System.out.println("Type:"+type);
	   }
	  
	   
}
class Redmi extends Mobile
{
      String name;
	  int price;
	  int ram;
	  
	 
	  
      Redmi(int id ,String type,String name,int price,int ram)
	  {
	      super(id,type);
	      this.name=name;
	      this.price=price;
	      this.ram=ram;
	      
	      
	  }
	  
	  void display()
	  {
	    System.out.println("Name:"+name);
        System.out.println("Price:"+price);
        System.out.println("RAM:"+ram);
	  }
}
