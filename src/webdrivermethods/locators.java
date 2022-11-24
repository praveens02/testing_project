package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveen\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	 
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg9-N4ZiJ664kOFK0ehXv3fWiS7uwLGq2XW1FvmT1V_iTAAAAAQAAAABjLA6hcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Foffers%2Fnonprimehomepage%3F_encoding%253DUTF8%2526dvah%253Dnonprimehomepage%2526ref_%253Ddvm_pds_amz_in_as_s_g_146&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=258-8629034-1098752&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
	WebElement email = driver.findElement(By.id("ap_email"));
	email.sendKeys("praveen@gmail.com");
	
	WebElement password = driver.findElement(By.id("ap_password"));
	password.sendKeys("praveen7733");
	
	WebElement login = driver.findElement(By.id("signInSubmit"));
	login.click();
	
	
	
	
	
	
	}
	
	
}
