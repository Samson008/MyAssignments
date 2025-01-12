package week2.day1;

public class Browser {
	
	public String launchBrowser(String a){
	 System.out.println(a);
	 return a;
	}
	
	public void loadUrl() {
		System.out.println("Application  url loaded sucessfully");
		
	}
	public static void main(String[] args) {
		Browser b = new Browser();
		String launchBrowser = b.launchBrowser("Chrome");
		System.out.println(launchBrowser);
		launchBrowser = "age";
		System.out.println(launchBrowser);
		b.loadUrl();		
	}
}
