import java.util.HashMap;
import java.util.Map.Entry;

class HashMapTraverse{
    public static void main(String[] args) {

        // create a HashMap
        HashMap<Integer, String> books = new HashMap<>();
        books.put(101, "The Alchemist");
        books.put(102, "Sapiens");
        books.put(103, "Atomic Habits");

        System.out.println("HashMap: " + books);

        // Check size of the map
        System.out.println("Size of HashMap: " + books.size());

        // Check if the map is empty
        System.out.println("Is the HashMap empty? " + books.isEmpty());

        // iterate through keys only
        System.out.print("Keys: ");
        for (Integer key : books.keySet()) {
            System.out.print(key + " ");
        }

        // iterate through values only
        System.out.print("\nValues: ");
        for (String value : books.values()) {
            System.out.print(value + " ");
        }

        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

       
    }
}
