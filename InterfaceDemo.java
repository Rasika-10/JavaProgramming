class InterfaceDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();                     
        p.display(10, "Rasi");          
    }
}

interface Details {
  
    int id = 1;
    String name = "Adhi";
    String dep = "ECE";

    void display();                      
    void display(int id, String name);  
}


class Person implements Details {
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dep);
    }

    public void display(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dep); 
    }
}
