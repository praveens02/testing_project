package webdrivermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praveen\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://letcode.in/dropdowns");

WebElement ck = driver.findElement(By.id("fruits"));
ck.click();

WebElement multi = driver.findElement(By.id("superheros"));
Select s = new Select(multi);
System.out.println(s.isMultiple());

s.selectByValue("am");
s.selectByValue("aq");
s.selectByVisibleText("The Avengers");
s.selectByVisibleText("Batman");

s.deselectByVisibleText("The Avengers");
s.deselectByVisibleText("Batman"); 

List<WebElement> options = s.getOptions();
for (WebElement all : options) {
	System.out.println(all.getText());                                                                                                                              
	
}
System.out.println("All selected option");

List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
for (WebElement selectedOptions : allSelectedOptions) {
	System.out.println(selectedOptions.getText());
}
System.out.println("first selected option");

WebElement firstSelectedOption = s.getFirstSelectedOption();
System.out.println(firstSelectedOption.getText());

s.deselectAll();
	}
		
		
	}
	
	
	
	
	
	
	


