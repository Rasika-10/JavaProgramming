class Aggregation {
    public static void main(String[] args) {
        
        College c=new College("Krishna");
        Student s1=new Student("adhi","IT");
        Student s2=new Student("rasi","IT");
        

        c.display(s1);

    }
}

class College
{
    String cname;
    Student s;
    College(String cname)
    {
        this.cname=cname;
    }
    void display(Student s)
    {
        System.out.println("College name: "+cname);
         System.out.println("Name:"+s.name);
          System.out.println("Dep: "+s.dep);
        
    }
}
class Student
{
    String name;
    String dep;
    
    Student(String name,String dep)
    {
        this.name=name;
        this.dep=dep;
    }
    
}
