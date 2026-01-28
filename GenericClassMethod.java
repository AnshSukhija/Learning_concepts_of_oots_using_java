package Day14;

class Demo<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
    public <U> void display(U data) {
        System.out.println("Generic method value: " + data);
    }
}

public class GenericClassMethod {
    public static void main(String[] args) {
        Demo<String> strBox = new Demo<>();
        strBox.set("Hello");
        System.out.println("From set & get method: " + strBox.get());
        strBox.display(100); 
        strBox.display("World"); 
    }
}
