class AbstractClass {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.display();
        p.getDetails();
        p.processPayment();
    }
}

abstract class Payment {
    abstract void display();            
    abstract void processPayment();   

    void getDetails() {                
        System.out.println("Fetching payment details...");
    }
}

class CreditCardPayment extends Payment {
    void display() {
        System.out.println("Payment Method: Credit Card");
    }

    void processPayment() {
        System.out.println("Processing payment through Credit Card Gateway...");
    }
}
