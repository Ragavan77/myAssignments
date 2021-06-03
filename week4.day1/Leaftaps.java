package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaps 
{
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(options);
	
	
	driver.get("http://leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Actions builder=new Actions(driver);
	WebElement w1=driver.findElementByXPath("(//option[text()='Selenium'])[6]");
	WebElement w2=driver.findElementByXPath("(//option[text()='Loadrunner'])[6]");
	
	builder.keyDown(Keys.CONTROL).click(w1).click(w2).perform();
	driver.close();
	
	

}
}