class UsageOfSuperKeyword
{
    public static void main(String args[])
    {
        Car c = new Car(1, "Petrol", "Honda City", 1200000, 5);
        c.display();
    }
}

class Vehicle
{
    int id;
    String fuelType;
    String engine = "V8";

  

    Vehicle(int id, String fuelType)
    {
      
        this.id = id;
        this.fuelType = fuelType;
    }

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle
{
    String model;
    int price;
    int seatingCapacity;

    Car(int id, String fuelType, String model, int price, int seatingCapacity)
    {
        super(id, fuelType);
        super.id = 10; 
        this.model = model;
        this.price = price;
        this.seatingCapacity = seatingCapacity;
    }

    void display()
    {
        super.display();
        System.out.println("Engine: " + super.engine);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}
