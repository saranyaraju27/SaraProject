package week2.day1;

public class LearnAccessModifier1 {

	public void depositeAmount() {
		
	System.out.println("Deposit");
	}
	
	private void withdrawAmount() {
		System.out.println("withdrawn");

	}
	
	void knowATM() {
		
		System.out.println("1335");
	}

	 public static void main(String[] args) {
	 
		 LearnAccessModifier1 bank=new LearnAccessModifier1();
		 bank.depositeAmount();
		 bank.withdrawAmount();
		 bank.knowATM();
	 }
	 
}
