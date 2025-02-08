package week2.day1;

public class Browser {

	public String launchBrowser(String bro){
		System.out.println("launching");
		System.out.println(bro);
		return bro;
		
		
	}
	
	public void loadURL() {
		
		System.out.println("urladded");
	}
	public static void main(String[] args) {

		Browser brow = new Browser();
		String launchBrowser = brow.launchBrowser("launchurlsuccessfully");
		brow.loadURL();
		launchBrowser="example";
		System.out.println(launchBrowser);

	}

}
