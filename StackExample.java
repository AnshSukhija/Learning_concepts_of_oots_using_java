package Day15;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(50);
		System.out.println("Stack after pushes:"+stack);
		System.out.println("Top element using peek():"+stack.peek());
		System.out.println("postion of 20 using search():"+stack.search(20));
		System.out.println("postion of 50 using search():"+stack.search(50));
		System.out.println("is stack empty?"+stack.isEmpty());
		System.out.println("Size of stack"+stack.size());
		System.out.println("\nIterating use for each");
		for(Integer num :stack) {
			System.out.println(num);
		}
		System.out.println("\nIterating using iterator");
		Iterator<Integer> it =stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nIterating using for loop");
		for (int i=0;i<stack.size();i++) {
			System.out.println(stack.get(i));
		}
		stack.clear();
		System.out.println("Stack after clear(): "+stack);
		System.out.println("is stack empty now?"+stack.isEmpty());
	}

}
