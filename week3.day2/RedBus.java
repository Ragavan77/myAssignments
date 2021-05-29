package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//div[@class='fl search-box clearfix']/div/input").sendKeys("C");
		driver.findElementByXPath("(//ul[@class='autoFill']/li)[2]").click();
		driver.findElementByXPath("//div[@class='fl search-box']/div/input").sendKeys("c");
		driver.findElementByXPath("(//ul[@class='autoFill']/li)[1]").click();
		//date right arrow click
		driver.findElementByXPath("//td[@class='next']/button").click();
		//Selecting day 16th july
		driver.findElementByXPath("((//table[@class='rb-monthTable first last']//tr)[5]//td)[3]").click();
		//search buses
		driver.findElementByXPath("//button[@id='search_btn']").click();
		//Total busses available
		String totalBuses= driver.findElementByXPath("//span[@class='w-60 d-block d-found']").getText();
		System.out.println(totalBuses);
		//choose sleeper bus
		driver.findElementByXPath("(//label[@class='cbox-label'])[6]").click();
		//no. of results
		String sleeperBuses= driver.findElementByXPath("//span[@class='w-60 d-block d-found']").getText();
		System.out.println(sleeperBuses);
		//AC bus
		driver.findElementByXPath("//span[@class='w-60 d-block d-found']").click();
		String acBus=driver.findElementByXPath("(//div[@class='w-30 fl']/span)[1]").getText();
		System.out.println(acBus);
		driver.close();
		
		
	}
	
	
	

}
