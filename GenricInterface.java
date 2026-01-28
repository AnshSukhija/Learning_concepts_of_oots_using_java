package Day14;

interface Display<T> {
    void show(T data);
}

class IntegerDisplay implements Display<Integer> {
    public void show(Integer data) {
        System.out.println("Integer value: " + data);
    }
}

class StringDisplay implements Display<String> {
    public void show(String data) {
        System.out.println("String value: " + data);
    }
}

public class GenricInterface {
    public static void main(String[] args) {
        Display<Integer> intDisp = new IntegerDisplay();
        intDisp.show(123);

        Display<String> strDisp = new StringDisplay();
        strDisp.show("Hello Generics Interface");
    }
}