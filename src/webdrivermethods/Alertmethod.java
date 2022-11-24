package webdrivermethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praveen\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in/alert");
		WebElement accept = driver.findElement(By.id("accept"));
		accept.click();
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.id("confirm"));
		confirm.click();
		driver.switchTo().alert().accept();
		WebElement prompt = driver.findElement(By.id("prompt"));
		prompt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("praveen");
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		

	}

}
