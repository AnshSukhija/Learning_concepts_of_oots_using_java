package Day14;
class Person{
	public <T> Person(T data){
		System.out.println("Generic constructor called with: "+data);
	}
}
public class GenericConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person p1 = new Person("Alice");
			Person p2 = new Person(25);
			Person p3 = new Person(5.9);
	}

}
