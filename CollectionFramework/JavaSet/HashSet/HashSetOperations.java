import java.util.HashSet;

class HashSetOperations {
    public static void main(String[] args) {

        // Create HashSet A
        HashSet<Integer> setA = new HashSet<>();
        setA.add(10);
        setA.add(20);
        setA.add(30);
        System.out.println("Set A: " + setA);

        // Create HashSet B
        HashSet<Integer> setB = new HashSet<>();
        setB.add(20);
        setB.add(40);
        setB.add(50);
        System.out.println("Set B: " + setB);

        // 1. Union
        HashSet<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        // 2. Intersection
        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        // 3. Difference (A - B)
        HashSet<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (A - B): " + difference);

        // 4. Subset check: Is B a subset of A?
        boolean isSubset = setA.containsAll(setB);
        System.out.println("Is Set B a subset of Set A? " + isSubset);
    }
}
