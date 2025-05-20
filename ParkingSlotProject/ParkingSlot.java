import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Parking Lot ID:");
        String lotId = scanner.nextLine();

        System.out.println("Enter number of floors:");
        int floors = scanner.nextInt();

        System.out.println("Enter number of slots per floor:");
        int slotsPerFloor = scanner.nextInt();
        scanner.nextLine(); // consume newline

        List<String> slotTypes = new ArrayList<>();
        System.out.println("Enter vehicle type for each slot (e.g., truck bike bike car car electric_car):");
        String[] slotTypeArray = scanner.nextLine().split(" ");
        slotTypes.addAll(Arrays.asList(slotTypeArray));

        ParkingLot lot = new ParkingLot(lotId, floors, slotsPerFloor, slotTypes);
        ITicketService ticketService = new TicketService();
        SlotManager manager = new SlotManager(lot, ticketService);

        while (true) {
            System.out.println("\n1. Park\n2. Unpark\n3. Show Available\n4. Show Occupied\n5. Show Tickets\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter vehicle type (car/bike/truck/electric_car):");
                    String type = scanner.nextLine();

                    System.out.println("Enter registration number:");
                    String reg = scanner.nextLine();

                    System.out.println("Enter color:");
                    String color = scanner.nextLine();

                    Vehicle vehicle = switch (type.toLowerCase()) {
                        case "car" -> new Car(reg, color);
                        case "bike" -> new Bike(reg, color);
                        case "truck" -> new Truck(reg, color);
                        case "electric_car" -> new ElectricCar(reg, color);
                        default -> null;
                    };

                    if (vehicle != null) {
                        String ticket = manager.parkVehicle(vehicle);
                        System.out.println(ticket != null ? "Parked Successfully!!... Ticket: " + ticket : "No available slot.");
                    } else {
                        System.out.println("Invalid vehicle type.");
                    }
                    break;

                case 2:
                    System.out.println("Enter ticket ID (e.g., PK101_1_2):");
                    String ticketId = scanner.nextLine();

                    if (!ticketId.matches("^[A-Za-z0-9]+_\\d+_\\d+$")) {
                        System.out.println("Invalid format. Use format: LOTID_FLOOR_SLOT (e.g., PK101_1_2)");
                        break;
                    }

                    boolean success = manager.unparkVehicle(ticketId);
                    System.out.println(success ? "Unparked successfully." : "Invalid or empty slot.");
                    break;

                case 3:
                    System.out.println("Enter vehicle type:");
                    manager.showSlots(scanner.nextLine(), false);
                    break;

                case 4:
                    System.out.println("Enter vehicle type:");
                    manager.showSlots(scanner.nextLine(), true);
                    break;

                case 5:
                    manager.displayAllTickets();
                    break;

                case 6:
                    System.out.println("Exited!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

interface ITicketService {
    String generateTicket(String lotId, int floor, int slot);
   
}

class TicketService implements ITicketService {
    public String generateTicket(String lotId, int floor, int slot) {
        return lotId + "_" + floor + "_" + slot;
    }

    
}

abstract class Vehicle {
    String registrationNumber;
    String color;

    public Vehicle(String registrationNumber, String color) {
        this.registrationNumber = registrationNumber;
        this.color = color;
    }

    abstract String getType();
}

class Car extends Vehicle {
    public Car(String reg, String color) { 
        super(reg, color); 
    }
    String getType() { 
        return "car"; 
    }
}

class Bike extends Vehicle {
    public Bike(String reg, String color) { 
        super(reg, color); 
    }
    String getType() { 
        return "bike"; 
    }
}

class Truck extends Vehicle {
    public Truck(String reg, String color) {
         super(reg, color); 
    }
    String getType() { 
        return "truck"; 
    }
}

class ElectricCar extends Vehicle {
    public ElectricCar(String reg, String color) {
         super(reg, color); 
    }
    String getType() {
        return "electric_car"; 
    }
}

class Slot {
    int slotNumber;
    String vehicleType;
    boolean occupied;
    Vehicle vehicle;

    public Slot(int slotNumber, String vehicleType) {
        this.slotNumber = slotNumber;
        this.vehicleType = vehicleType;
        this.occupied = false;
        this.vehicle = null;
    }
}

class Floor {
    int floorNumber;
    List<Slot> slots = new ArrayList<>();

    public Floor(int floorNumber, int slotsPerFloor, List<String> slotTypes) {
        this.floorNumber = floorNumber;
        initializeSlots(slotsPerFloor, slotTypes);
    }

    private void initializeSlots(int slotsPerFloor, List<String> slotTypes) {
        for (int i = 0; i < slotsPerFloor; i++) {
            String type = i < slotTypes.size() ? slotTypes.get(i) : "car";
            slots.add(new Slot(i + 1, type));
        }
    }
}

class ParkingLot {
    String lotId;
    List<Floor> floors = new ArrayList<>();

    public ParkingLot(String lotId, int numFloors, int slotsPerFloor, List<String> slotTypes) {
        this.lotId = lotId;
        for (int i = 0; i < numFloors; i++) {
            floors.add(new Floor(i + 1, slotsPerFloor, slotTypes));
        }
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public String getLotId() {
        return lotId;
    }
}

class SlotManager {
    ParkingLot lot;
    ITicketService ticketService;
    Map<String, Slot> tickets = new HashMap<>();

    public SlotManager(ParkingLot lot, ITicketService ticketService) {
        this.lot = lot;
        this.ticketService = ticketService;
    }

    public String parkVehicle(Vehicle vehicle) {
        for (Floor floor : lot.getFloors()) {
            for (Slot slot : floor.slots) {
                if (!slot.occupied && slot.vehicleType.equals(vehicle.getType())) {
                    slot.occupied = true;
                    slot.vehicle = vehicle; //it saving the actual vehicle details (registration number, type, color, etc.) inside the slot.
                    String ticket = ticketService.generateTicket(lot.getLotId(), floor.floorNumber, slot.slotNumber);
                    tickets.put(ticket, slot);
                    return ticket;
                }
            }
        }
        return null;
    }

    public boolean unparkVehicle(String ticketId) {
        Slot slot = tickets.get(ticketId);
        if (slot != null && slot.occupied) {
            slot.occupied = false;
            slot.vehicle = null;         // When someone gives a ticket to unpark, you use that ticket to find the slot
                                       //   From the slot, you access slot.vehicle to remove it
            tickets.remove(ticketId);
            return true;
        }
        return false;
    }

    public void showSlots(String type, boolean showOccupied) {
        for (Floor floor : lot.getFloors()) {
            System.out.print("Floor " + floor.floorNumber + ": ");
            for (Slot slot : floor.slots) {
                if (slot.vehicleType.equals(type) && slot.occupied == showOccupied) {
                    System.out.print(slot.slotNumber + " ");
                }
            }
            System.out.println();
        }
    }

    //tickets = { "PR123_1_1" : Slot(slotNumber=1, vehicleType="TRUCK", vehicle=Vehicle("TRUCK", "TN-88-AB-1111", "Red"))}
    public void displayAllTickets() {
        for (Map.Entry<String, Slot> entry : tickets.entrySet()) {
            Vehicle v = entry.getValue().vehicle;
            System.out.println(entry.getKey() + " => " + entry.getValue().vehicleType + " | " + v.registrationNumber + " | " + v.color);
           
        
        }
    }
}
