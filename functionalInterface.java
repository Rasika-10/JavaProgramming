class functionalInterface implements Payable {
    public static void main(String[] args) {
        functionalInterface p = new functionalInterface();
        p.processPayment(); 

     }
    public void processPayment() {
        System.out.println("Payment processed successfully using UPI.");
    }
}

@FunctionalInterface
interface Payable {
    void processPayment();
}

