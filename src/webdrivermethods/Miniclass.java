package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniclass {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\praveen\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");	
WebDriver p= new ChromeDriver();
p.manage().window().maximize();
p.get("https://adactinhotelapp.com/index.php");
p.findElement(By.id("username")).sendKeys("praveenjava");
p.findElement(By.id("password")).sendKeys("praveen7733");
p.findElement(By.id("login")).click();
WebElement l = p.findElement(By.id("location"));	
Select a = new Select(l);
a.selectByVisibleText("Los Angeles");
WebElement h = p.findElement(By.id("hotels"));
Select b = new Select(h);
b.selectByVisibleText("Hotel Sunshine");
WebElement r = p.findElement(By.id("room_type"));
Select c =new Select(r);
c.selectByVisibleText("Deluxe");
WebElement rn = p.findElement(By.id("room_nos"));
Select d =new Select(rn);
d.selectByVisibleText("2 - Two");
p.findElement(By.id("datepick_in")).clear();
p.findElement(By.id("datepick_in")).sendKeys("25/10/2022");
p.findElement(By.id("datepick_out")).clear();
p.findElement(By.id("datepick_out")).sendKeys("29/10/2022");
WebElement ar = p.findElement(By.id("adult_room"));
Select e= new Select(ar);
e.selectByVisibleText("2 - Two");
WebElement cr = p.findElement(By.id("child_room") );
Select f= new Select(cr);
f.selectByVisibleText("1 - One");
p.findElement(By.id("Submit")).click();
p.findElement(By.id("radiobutton_0")).click();
p.findElement(By.id("continue")).click();
p.findElement(By.id("first_name")).sendKeys("Praveen");
p.findElement(By.id("last_name")).sendKeys("Sakthivel");
p.findElement(By.id("address")).sendKeys("Chennai");
p.findElement(By.id("cc_num")).sendKeys("1234567890123456");
WebElement cct = p.findElement(By.id("cc_type"));
Select g= new Select(cct);
g.selectByVisibleText("Other");
WebElement cm = p.findElement(By.id("cc_exp_month"));
Select i= new Select(cm);
i.selectByVisibleText("February");
WebElement ccy = p.findElement(By.id("cc_exp_year"));
Select j= new Select(ccy);
j.selectByVisibleText("2022");
p.findElement(By.id("cc_cvv")).sendKeys("123");
p.findElement(By.id("book_now")).click();






	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
