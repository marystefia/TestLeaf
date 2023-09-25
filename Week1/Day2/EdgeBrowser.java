package week1.day2;

public class EdgeBrowser{
	public static void main(String[] args) {
		Browser obj=new Browser();
		System.out.println(obj.launchBrowser("Edge")+" browser loaded successfully");
		obj.loadUrl();
	}
}
