package week2.day1;

public class Mobile {
	// int a=10; //we can use this for all methods
	
	//Parameter or Argument - Pass input to that method
	public void sentSms(String sms,int numberOfMessage) {
		
		//int b=5;inside this method alone
	//System.out.println(sms);
	//Concat++
		
		System.out.println(sms+""+numberOfMessage);
	
	}

	public static void main(String[] args) {
     Mobile mobileOptions = new Mobile();
     mobileOptions.sentSms("hi",5);
    
	}

}
