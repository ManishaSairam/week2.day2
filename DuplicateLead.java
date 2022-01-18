package assignmentweek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("manishasai@gmail.com");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Duplicate Lead | opentaps CRM";
		
		if(actualTitle.contains(expectedTitle))
			System.out.println("verified");
		else
			System.out.println("not verified");
		
		driver.findElement(By.name("submitButton")).click();
		String duplicateName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(duplicateName.contains(leadName))
			System.out.println("match");
		else
			System.out.println("not match");
		driver.close();
		
	}
}
