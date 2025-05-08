class Composition{
    public static void main(String[] args) {
        
        Person p=new Person(1,"Rasika");
        FeeDetails f=new FeeDetails(130000);
        Details d=new Details("IT",p,f);
        d.display();
        
       
    }
}

class Person
{
    int id;
    String name;
    Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        
    }
    
}
class FeeDetails
{
    int fees;
    
    FeeDetails(int fees)
    {
        this.fees=fees;
    }
    
    void display()
    {
        
     
        System.out.println("Fees:"+fees);
    }
}

class Details
{
    String dep;
    Person p;
    FeeDetails f;
    Details(String dep,Person p,FeeDetails f)
    {
        this.dep=dep;
        this.p=p;
        this.f=f;
    }
    
    void display()
    {
        
        p.display();
        System.out.println("Dep:"+dep);
        f.display();
    }
}


