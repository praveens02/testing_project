package webdrivermethods;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWebTabe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\praveen\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
		WebDriver p = new ChromeDriver();
		 p.manage().window().maximize();
		p.get("https://letcode.in/table");
		System.out.println("**ALL DATA**");
		List<WebElement> alldata = p.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
		for (WebElement webElement : alldata) {
			System.out.println(webElement.getText());	
		}
		System.out.println();
		System.out.println("rowdata");
		List<WebElement> rd = p.findElements(By.xpath("(//table)[2]/tbody/tr[1]/td"));
		for (WebElement rds : rd) {
			System.out.println(rds.getText());
			
		}
		 System.out.println();
		 System.out.println("columndata");
		 List<WebElement> cp = p.findElements(By.xpath("(//table)[2]/tbody/tr/td[3]"));
		 for (WebElement cpm : cp) {
		System.out.println(cpm.getText());	
		}
		 System.out.println();
		 System.out.println("Particular");
		 WebElement pa = p.findElement(By.xpath("(//table)[2]/tbody/tr[1]/td[1]"));
		 System.out.println(pa.getText());		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
