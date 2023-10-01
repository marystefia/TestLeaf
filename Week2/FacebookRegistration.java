package week1.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException{
		//launch facebook website
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.wait(2000);
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//create account
		driver.findElement(By.name("firstname")).sendKeys("Andriya");
		driver.findElement(By.name("lastname")).sendKeys("Benneth");
		driver.findElement(By.name("reg_email__")).sendKeys("andben123@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Aryn@123");
		
		WebElement ddDay = driver.findElement(By.id("day"));
		Select day = new Select(ddDay);
		day.selectByIndex(14);
		
		WebElement ddMonth = driver.findElement(By.id("month"));
		Select month = new Select(ddMonth);
		month.selectByValue("4");
		
		WebElement ddYear = driver.findElement(By.id("year"));
		Select year = new Select(ddYear);
		year.selectByVisibleText("1990");
		
		driver.findElement(By.tagName("label")).click();
		
		
	}

}
