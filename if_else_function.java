package Day2;

public class if_else_function {
	public void checkbalance(double balance) {
		if (balance <1000) {
			System.out.println("Balance is low");
		}
		else if(balance>1000 && balance<2000){
			System.out.println("Medium balance");
		}
		else {
			System.out.println("Sufficient Balance");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if_else_function bc = new if_else_function();
		bc.checkbalance(500);
		bc.checkbalance(1500);
		bc.checkbalance(2500);
	}

}
