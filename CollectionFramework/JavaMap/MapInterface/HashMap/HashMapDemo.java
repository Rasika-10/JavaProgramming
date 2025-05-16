import java.util.HashMap;

class HashMapDemo{
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> countries = new HashMap<>();

        // put() method to add elements
        countries.put(101, "India");
        countries.put(102, "Germany");
        countries.put(103, "Canada");
        System.out.println("Initial HashMap: " + countries);

        // get() method
        String val = countries.get(101);
        System.out.println("Value at key 101: " + val);

        // getOrDefault() method
        System.out.println("Value for key 103: " + countries.getOrDefault(103, "Not Found"));
        System.out.println("Value for key 104: " + countries.getOrDefault(104, "Not Found"));

        // keySet()
        System.out.println("Keys: " + countries.keySet());

        // values()
        System.out.println("Values: " + countries.values());

        // entrySet()
        System.out.println("Key/Value mappings: " + countries.entrySet());

        // replace()
        countries.replace(102, "France");
        System.out.println("HashMap after replace(): " + countries);

        // remove()
        String removed = countries.remove(103);
        System.out.println("Removed value (key 103): " + removed);
        System.out.println("HashMap after remove(): " + countries);

        // containsKey()
        if (countries.containsKey(101)) 
            System.out.println("Present in the HashMap.");
        else 
            System.out.println("Not present in the HashMap.");

        // containsValue()
        if (countries.containsValue("France")) {
            System.out.println("Present in the HashMap.");
        }
        else 
            System.out.println("Not present in the HashMap.");

        // Create another HashMap with String keys
        HashMap<String, String> student = new HashMap<>();
        student.put("Name", "Ravi");
        student.put("Department", "IT");
        student.put("City", "Chennai");
        System.out.println("\nStudent Details: " + student);

        if (student.containsKey("Department")) {
            System.out.println("Key 'Department' exists.");
        }

        if (student.containsValue("Chennai")) {
            System.out.println("Value 'Chennai' exists.");
        }
    }
}
