package Day15;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        System.out.println("Initial LinkedList: " + list);
        list.add(2, "Grapes");
        System.out.println("After adding Grapes at index 2: " + list);
        list.addFirst("Pineapple");
        list.addLast("Strawberry");
        System.out.println("After addFirst and addLast: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        list.set(1, "Blueberry");
        System.out.println("After updating index 1: " + list);
        list.remove(3);
        list.remove("Mango");
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list);
        list.remove(1);
        list.remove("Mango");
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list);
        System.out.println("Contains Orange? " + list.contains("Orange"));
        System.out.println("Index of 'Orange': " + list.indexOf("Orange"));
        System.out.println("Size of LinkedList: " + list.size());
        System.out.println("\nIterating using for-each:");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nIterating in descending order:");
        Iterator<String> descIt = list.descendingIterator();
        while (descIt.hasNext()) {
            System.out.println(descIt.next());
        }
        Object[] arr = list.toArray();
        System.out.println("\nLinkedList as array: " + Arrays.toString(arr));
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned LinkedList: " + clonedList);
        list.clear();
        System.out.println("After clear(), is LinkedList empty? " + list.isEmpty());
    }
}
