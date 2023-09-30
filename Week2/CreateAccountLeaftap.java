package week1.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountLeaftap {
	public static void main(String[] args) {
		
		//launch website
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//Login into leaftaps
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create Account
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Stefia");
		driver.findElement(By.tagName("textarea")).sendKeys("Selenium Automation Tester.");
		
		WebElement ddIndustry = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(ddIndustry);
		industry.selectByValue("IND_SOFTWARE");
		
		WebElement ddOwnership = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(ddOwnership);
		ownership.selectByVisibleText("S-Corporation");
		
		WebElement ddSource = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(ddSource);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement ddMarketing = driver.findElement(By.id("marketingCampaignId"));
		Select marketing = new Select(ddMarketing);
		marketing.selectByIndex(7);
		
		WebElement ddProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select province = new Select(ddProvince);
		province.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
	}
}
