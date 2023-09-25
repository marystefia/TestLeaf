package week1.day2;

public class Browser {
	String launchBrowser(String browserName){
		//System.out.println("Browser launched successfully");
		return browserName;
	}
	void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	  public static void main(String[] args) { Browser obj=new Browser();
	  System.out.println(obj.launchBrowser("Chrome")+" browser launched successfully"); 
	  obj.loadUrl(); }
	 
}

