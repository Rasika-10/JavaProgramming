class MethodOverriding {
    public static void main(String args[]) {
        Employee ref = new Manager(); 
        ref.display(); 


    }
}

class Employee {
    public void display() {
        System.out.println("I am an employee of the company.");
    }
}

class Manager extends Employee {
    public void display() {
        System.out.println("I am a manager handling a team.");
    }
}
