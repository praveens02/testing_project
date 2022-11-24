package webdrivermethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicwait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praveen\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
		WebDriver wait = new ChromeDriver();
		wait.manage().window().maximize();
		wait.get("https://www.amazon.in/");
		
		wait.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait.findElement(By.xpath("//div[@id='nav-xshop']//child::a[@class='nav-a  '][3]")).click();
		
		WebElement ex = wait.findElement(By.xpath("//a[@id='nav- hamburger-menu']//following::a[@class='nav-a  '][5])"));
		WebDriverWait sp = new WebDriverWait(wait, 10);
		sp.until(ExpectedConditions.visibilityOf(ex)); 
		ex.click();
		
		
				
		
	}
	
	
	
	

}
