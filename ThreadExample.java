package Day10;
class Runnable1 implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread"+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
	}
}
public class ThreadExample{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable1 r1= new Runnable1();
		Thread thread = new Thread (r1);
		thread.start();
		System.out.println("Mian thread is runnig...");
		Thread t2=new Thread(r1);
		t2.start();
	}
}

