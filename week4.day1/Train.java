package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Train {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("ms", Keys.TAB );
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("mdu", Keys.TAB);
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		Thread.sleep(10000);
		List<WebElement> allRows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[2]/td");
		int rowCount=allRows.size();
		List<String> tnames = new ArrayList<String>();
		
		
		for (int i = 1; i <= rowCount; i++) {
			String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			tnames.add(trainName);
			
		}
		
		Set<String> setTrainNames=new LinkedHashSet<String>(tnames);
		if(tnames.size() != setTrainNames.size())
				{
			System.err.println("dup");
				}
		else {
			System.out.println("no dup");
		}
		
			
		}
}
