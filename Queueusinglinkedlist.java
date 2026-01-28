package Day15;
import java.util.*;
public class Queueusinglinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		queue.add("Apple");
		queue.add("banana");
		queue.offer("orange");
		queue.offer("mango");
		System.out.println("IntialQueue: "+queue);
		System.out.println("Head of the Queue(peek): "+queue.peek());
		System.out.println("Removed elemen (poll): "+queue.poll());
		System.out.println("Queue after poll: "+queue);
		System.out.println("remove element(remove): "+queue.remove());
		System.out.println("Queue after remove: "+queue);
		System.out.println("Contains Mango?"+queue.contains("mango"));
		System.out.println("\nIterating using for each");
		for(String item:queue) {
			System.out.println(item);
		}
		Object[] arr = queue.toArray();
		System.out.println("\nQueue elements as Array: "+Arrays.toString(arr));
		queue.clear();
		System.out.println("Ater clear()"+queue.isEmpty());
	}

}
