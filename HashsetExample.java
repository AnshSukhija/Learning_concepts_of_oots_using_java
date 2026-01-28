package Day15;

import java.util.*;

public class HashsetExample {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        Set<String> set = new HashSet<>();

        // 1. Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Banana"); // duplicate (ignored)

        System.out.println("Initial Set: " + set);

        // 2. Checking size
        System.out.println("Size of set: " + set.size());

        // 3. Contains check
        System.out.println("Does set contain 'Apple'? " + set.contains("Apple"));
        System.out.println("Does set contain 'Grapes'? " + set.contains("Grapes"));

        // 4. Removing an element
        set.remove("Orange");
        System.out.println("After removing Orange: " + set);

        // 5. Iterating using for-each
        System.out.println("Iterating with for-each:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 6. Iterating using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 7. isEmpty check
        System.out.println("Is set empty? " + set.isEmpty());

     // 8. AddAll (Union with another set)
     Set<String> set2 = new HashSet<>();
     set2.add("Kiwi");
     set2.add("Apple"); // duplicate will not be added
     set.addAll(set2);
     System.out.println("After addAll (Union): " + set);

     // 9. retainAll (Intersection)
     Set<String> set3 = new HashSet<>();
     set3.add("Apple");
     set3.add("Mango");
     set.retainAll(set3);
     System.out.println("After retainAll " + set);

     // 10. removeAll (Difference)
     set.removeAll(set3);
     System.out.println("After removeAll " + set);

     // 11. clear() method
     set.clear();
     System.out.println("Is set empty now? " + set.isEmpty());
    }
}