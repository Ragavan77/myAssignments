package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions builder=new Actions(driver);
		//Click on Calender
		WebElement clickCal=driver.findElementById("datepicker");
		builder.click(clickCal).perform();
		WebElement clickDate=driver.findElementByXPath("(//table[@class='ui-datepicker-calendar']//following-sibling::td)[13]/a");
		builder.moveToElement(clickDate).click().perform();
		/*
		 * WebElement
		 * selectedDate=driver.findElementByXPath("//input[@id='datepicker']");
		 * builder.moveToElement(selectedDate).perform();
		 */
		
		String selectedDate1=driver.findElementByXPath("//input[@id='datepicker']").getAttribute("value");
		System.out.println(selectedDate1);
	}

}
