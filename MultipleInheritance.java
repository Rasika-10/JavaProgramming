public class MultipleInheritance {
    public static void main(String[] args) {
        OnlineTransaction t = new OnlineTransaction();
        t.makePayment();
        t.processRefund();
    }
}


interface Payable {
    void makePayment();
}

interface Refundable {
    void processRefund();
}

class OnlineTransaction implements Payable, Refundable {
    public void makePayment() {
        System.out.println("Payment made successfully.");
    }

    public void processRefund() {
        System.out.println("Refund processed successfully.");
    }
}


