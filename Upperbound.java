package Day14;

class Boxes<T extends Number> {
    private T value;

    public Boxes(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class Upperbound {
    public static void main(String[] args) {
        Boxes<Integer> b1 = new Boxes<>(100);
        Boxes<Double> b2 = new Boxes<>(12.5);

        b1.display();
        b2.display();
    }
}
