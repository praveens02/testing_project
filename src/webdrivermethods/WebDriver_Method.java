package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\praveen\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe" );
    
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_96612yg6jw_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486453138860&hvpos=&hvnetw=g&hvrand=13176129527902970277&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061919&hvtargid=kwd-296458795081&hydadcr=14452_2154371&gclid=CjwKCAjwyaWZBhBGEiwACslQowkAMbX1v6Oyh28-RRcgpKEis4Kvp7fCAOBWX1uyK3twX5nE9V5__xoCgRAQAvD_BwE");
String title = driver.getTitle();

System.out.println(title);

String h=driver.getCurrentUrl();
System.out.println(h);
   
   driver.navigate().to("https://www.facebook.com/");
   
   driver.navigate().forward();
   driver.navigate().back();
   driver.navigate().to("https://www.facebook.com/");
   driver.navigate().refresh();
   driver.close();
   
   
}
}
