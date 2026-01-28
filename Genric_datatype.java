package Assessment_3;

class DataHolder<T> {
	private T value;
	
	public void set (T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}
}

public class Genric_datatype {

	public static void main(String[] args) {
		
		DataHolder<Integer>intBox = new DataHolder<>();
		intBox.set(100);
		System.out.println("Integer value: "+intBox.get());
		
		DataHolder<String> strBox = new DataHolder<>();
		strBox.set("hello ji");
		System.out.println("String Value: "+ strBox.get());
		
		DataHolder<Double> doubox = new DataHolder<>();
		doubox.set(4.55);
		System.out.println("Double Value: "+ doubox.get());
	}
}
