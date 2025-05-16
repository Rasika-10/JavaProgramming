import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {
        
        Stack<String> cities = new Stack<>();

        // Add elements using push()
        cities.push("London");
        cities.push("Paris");
        cities.push("Tokyo");
        System.out.println("Initial Stack: " + cities);

        // Peek: view top element
        String top = cities.peek();
        System.out.println("Top element: " + top);

        // Pop: remove top element
        String removed = cities.pop();
        System.out.println("Removed element: " + removed);
        System.out.println("Stack after pop: " + cities);

        // Search: find position (1-based from top)
        int position = cities.search("London");
        System.out.println("Position of 'London': " + position);

        // Check if stack is empty
        boolean isEmpty = cities.empty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
