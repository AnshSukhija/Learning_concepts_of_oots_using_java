package Day14;

class Container {
    // Static generic nested class
    static class Storage<T> {
        private T item;

        Storage(T item) {
            this.item = item;
        }

        void showItem() {
            System.out.println("Stored item: " + item);
        }
    }
}

public class GenericStaticClass {
    public static void main(String[] args) {
        // Integer storage
        Container.Storage<Integer> intStorage = new Container.Storage<>(100);
        intStorage.showItem();

        // String storage
        Container.Storage<String> strStorage = new Container.Storage<>("Hello");
        strStorage.showItem();
    }
}