package Day15;

import java.util.*;

public class ListUsingArrayList {
	public static void main(String[] args) {
		// Creating a List (using ArrayList implementation)
		List<String> list = new ArrayList<>();
		
		// 1. Adding elements
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Banana"); // duplicate allowed
		System.out.println("Initial List: " + list);
		
		// 2. Adding at specific index
		list.add(2, "Grapes");
		System.out.println("After adding Grapes at index 2: " + list);
		
		// 3. Getting element
		System.out.println("Element at index 3: " + list.get(3));
		
		// 4. Setting element
		list.set(1, "Kiwi");
		System.out.println("After replacing Banana with Kiwi at index 1: " + list);
		// 5. Removing element (by index and by object)
		list.remove(4); // removes element at index 4
		list.remove("Orange"); // removes "Orange"
		System.out.println("After removals: " + list);
		// 6. Contains check
		System.out.println("List contains 'Apple'?" + list.contains("Apple"));
		// 7. Size of list
		System.out.println("Size of list: " + list.size());
		// 8. Index methods
		System.out.println("Index of Banana: " + list.indexOf("Banana")); // first
		System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));
		// 9. Sublist
		List<String> sub = list.subList(1, 3);
		System.out.println("Sublist from index 1 to 2: " + sub);
		
		// 10. Iterating using for-each
		System.out.println("Iterating with for-each:");
		for (String fruit : list) {
		    System.out.println(fruit);
		}

		// 11. Iterating using Iterator
		System.out.println("Iterating with Iterator:");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}
		
		// 12. Check if empty
		System.out.println("Is list empty? " + list.isEmpty());
		// 13. Clearing list
		list.clear();
		System.out.println("After clearing: " + list);
		System.out.println("Is list empty now? " + list.isEmpty());
			
	}
}