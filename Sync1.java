package Day10;

class Counter2 {
    private int c = 0; // Shared variable
 // Synchronized method to increment counter
    public void inc() {
        synchronized(this) { // synchronized block
            c++;
        }

        for (int i = 0; i < 100; i++) { // unsynchronized block
            System.out.print(i + " ");
        }
    }
    public synchronized int get() {
        return c;
    }
}
public class Sync1 {
    public static void main(String[] args) {
        Counter2 cnt = new Counter2(); // Shared resource

        // Thread 1 to increment counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc(); 
            }
        });

        // Thread 2 to increment counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc();
            }
        });
        
        t1.start();
        t2.start();
     // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print final counter value
        System.out.println("Counter: " + cnt.get());
    }
   
}
