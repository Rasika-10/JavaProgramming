import java.util.HashSet;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        
        // Create first HashSet and add elements
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(3);
        primeNumbers.add(7);
        primeNumbers.add(11);
        System.out.println("Prime Numbers: " + primeNumbers);

        // Create second HashSet and use addAll()
        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(primeNumbers);
        numbers.add(9);
        numbers.add(15);
        System.out.println("Combined HashSet: " + numbers);

        // Check if a value exists
        System.out.println("Contains 9? " + numbers.contains(9));
        System.out.println("Contains 4? " + numbers.contains(4));

        // Remove a single element
        boolean removed = numbers.remove(15);
        System.out.println("Is 15 removed? " + removed);

        // Display size and use iterator
        System.out.println("Size of HashSet: " + numbers.size());
        System.out.print("Iterating over HashSet: ");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        // Remove all elements
        boolean cleared = numbers.removeAll(numbers);
        System.out.println("\nAre all elements removed? " + cleared);
        System.out.println("Is HashSet empty? " + numbers.isEmpty());
    }
}
