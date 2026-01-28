package Day14;
class Box<T>{
	private T value;
	public void set (T value) {
		this.value =value;
	}
	public T get() {
		return value;
	}
}
public class GenricExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer>intBox = new Box();
		intBox.set(100);
		System.out.println("Integer value: "+intBox.get());
		Box<String> strBox = new Box();
		strBox.set("hello ji");
		System.out.println("String Value: "+ strBox.get());
	}

}
