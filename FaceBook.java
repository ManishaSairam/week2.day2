package assignmentweek2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Manisha");
		driver.findElement(By.name("lastname")).sendKeys("Sairam");
		driver.findElement(By.name("reg_email__")).sendKeys("9962781352");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Manisha@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select dropdown = new Select(day);
		dropdown.selectByIndex(15);
		
		WebElement month=driver.findElement(By.id("month"));
		Select dropdown1=new Select(month);
		dropdown1.selectByIndex(6);
		
		WebElement year=driver.findElement(By.id("year"));
		Select dropdown2=new Select(year);
		dropdown2.selectByValue("1999");
		
		driver.findElement(By.xpath("//label[text()='Female']/following::input")).click();
		
		
}
}