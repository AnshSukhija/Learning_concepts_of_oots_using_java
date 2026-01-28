package Day7;

public class Specifier {

    public int a = 2;
    private int b = 4;
    protected int c = 3;
    int d = 8;

    public Specifier() {
        System.out.println("Constructor called");
    }

    public void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Specifier obj = new Specifier();
        obj.show();
    }
}
