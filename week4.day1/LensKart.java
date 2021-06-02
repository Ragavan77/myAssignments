package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LensKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.lenskart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions builder=new Actions(driver);
		WebElement computerGlasees=driver.findElementByXPath("(//div[@class='nav-level-1 three-col-layout'])[2]/a");
		WebElement men=driver.findElementByXPath("(//div[@class='gender_info'])[4]");
	
		//WebElement range=driver.findElementByXPath("(//div[@class='category-menu_list'])[12]//span");
	
		Thread.sleep(3000);
		WebElement range=driver.findElementByXPath("//*[@id=\"cssmenu\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/a/div/div/span[1]");
		builder.moveToElement(computerGlasees).moveToElement(men).click(range).perform();
		//range.click();
		//Frame- Click on Round Shape
		WebElement frame=driver.findElementByXPath("//span[@title='Round']/img");
		//List
		List<WebElement> colorList=driver.findElementsByXPath("(//ul[@class='filter-dropdown-menu list-unstyled menu-lk'])[3]/li");
		
		for (WebElement  clist: colorList) {
			System.out.println(clist.getText());
		}
		
		//click on Color with highest count
		WebElement color=driver.findElementByXPath("(//ul[@class='filter-dropdown-menu list-unstyled menu-lk'])[3]//span");
		String blackCount=color.getText().replaceAll("\\D", "");
		System.out.println(blackCount);
		
		builder.click(frame).click(color).perform();
		String count=driver.findElementByXPath("//div[@class='show_count']").getText();
		//count.replaceAll("Showing "+"+""[0-9]+" of ","" );
	
		System.out.println("Total no. of results "+count);
		if(blackCount.contains(count)) {
			
			System.out.println("Results verified");
			
		}
		else
		{
			System.out.println("Results verification failed");
		}
		
		WebElement firstItem=driver.findElementByXPath("(//div[@class='pos-abs '])[1]/following-sibling::img");
		builder.moveToElement(firstItem).pause(200).perform();
		Thread.sleep(2000);
		String size=driver.findElementByXPath("(//p[@class='fs12 no-decoration text-black margin-b0 inline-block'])[1]/span[text()='Medium']").getText();
		System.out.println("Size of 1st element is "+size);
		driver.close();
		
		
		//div[@class='show_count']
		
		//builder.moveToElement(range)
		
		
		//driver.findElementByXPath("(//span[@class='fw700'][text()='PREMIUM RANGE'])[3]").click();
		//builder.moveToElement(range).click().perform();
		

	}

}
