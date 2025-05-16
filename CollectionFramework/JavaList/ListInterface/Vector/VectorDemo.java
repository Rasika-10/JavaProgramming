import java.util.Vector;
import java.util.Iterator;

class VectorDemo {
    public static void main(String[] args) {
        
        // Creating and adding elements to Vector
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Mango");

        // Adding element at a specific index
        fruits.add(2, "Banana");
        System.out.println("Vector after add(): " + fruits);

        // Creating another Vector and using addAll()
        Vector<String> items = new Vector<>();
        items.add("Watermelon");
        items.addAll(fruits);
        System.out.println("New Vector after addAll(): " + items);

        // Accessing element using get()
        String element = items.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator
        System.out.print("Vector using iterator(): ");
        Iterator<String> iterate = items.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
        System.out.println();

        // Removing element by index
        String removedElement = items.remove(1);
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Vector after remove(): " + items);

        // Clearing the vector
        items.clear();
        System.out.println("Vector after clear(): " + items);
    }
}
