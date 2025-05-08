class MethodOverloading {
    // Print text
    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    // Print number
    void print(int number) {
        System.out.println("Printing number: " + number);
    }

    // Print double
    void print(double value) {
        System.out.println("Printing decimal: " + value);
    }

    public static void main(String[] args) {
        MethodOverloading p = new MethodOverloading();
        p.print("Invoice");
        p.print(100);
        p.print(99.99);
    }
}
