package week2.day1;

public class LearnMethods {


		//Normal Method
		//methodName should be performing the action
		//Naming convention camelCase
	//Mobile-Class
	//sentSMS,makeCall, makeVideoCall,saveContact,takePhoto
		
		public void takePhoto() {
			
			System.out.println("Take photo");
			
		}
			
		public void saveContact() {
			System.out.println("Save Contact");
		}
		
		private void makeCall() {
			System.out.println("Calling");
		}
		
		public static void main(String[] arg) {
		
		LearnMethods mobileOptions=new LearnMethods();
		mobileOptions.takePhoto();
		mobileOptions.saveContact();
		mobileOptions.makeCall();
		
	}
		
	
		
}

