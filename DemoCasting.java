class DemoCasting {
    public static void main(String[] args) {

        // Upcasting 
        Vehicle v = new Car(); // Car is treated as a Vehicle
        v.start();

        // Downcasting         
        Car c = new Car();
        Vehicle v1 = (Vehicle) c;
        v1.start();

      

        
    }
}

class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car is starting with keyless ignition...");
    }

   
}
