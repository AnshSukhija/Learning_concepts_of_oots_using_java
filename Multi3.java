package Day10;

public class Multi3 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
		for(int i=1;i<=1000;i++) {
			System.out.print(" "+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi3 m1=new Multi3();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		t1.start();
		t2.start();
	}
}
