package week2.day1;

public class LearnReturnTypes {
	
	public int applyBrake() {
		
		return 7;
		
	}
	
	public void applyHorn() {
		
		System.out.println("applyHorn");
	}

	public static void main(String[] args) {

		LearnReturnTypes carOptions=new LearnReturnTypes();
		System.out.println(carOptions.applyBrake());
		carOptions.applyHorn();
	
	}

}
