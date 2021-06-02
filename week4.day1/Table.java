package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> allCols = driver.findElementsByXPath("//table[@id='table_id']//tr//th");
		int colCount = allCols.size();
		List<WebElement> allRows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		int rowCount = allRows.size();
		List<String> tcol = new ArrayList<String>();
		List<String> trow = new ArrayList<String>();
		System.out.println("Total Columns is " + colCount);
		System.out.println("Total Rows is " + rowCount);
		//Value of Learn to interact with elements
		String value = driver.findElementByXPath("((//table[@id='table_id']//tr/td[1])[2]/following-sibling::td)[1]")
				.getText();
		System.out.println("progress value of 'Learn to interact with Elements " + value);
		//least check box click
		driver.findElementByXPath("((//table[@id='table_id']//tr/td[1])[2]/following-sibling::td)[2]/input").click();
		//steps for printing total no. of Rows
		for (int i = 1; i <= colCount; i++) {
			String colList = driver.findElementByXPath("(//table[@id='table_id']//tr/th)[" + i + "]").getText();

			Set<String> list = new LinkedHashSet<String>(tcol);
			list.add(colList);
			for (String clist : list) {
				System.out.println(clist);
			}
		}
        //steps for printing total no. of Columns
		for (int j = 1; j <= rowCount; j++) {
			String rows = driver.findElementByXPath("(//table[@id='table_id']//tr/td[1])[" + j + "]").getText();
			Set<String> rowList = new LinkedHashSet<String>(trow);
			rowList.add(rows);
			for (String rlist : rowList) {
				System.out.println(rlist);

			}
			driver.close();

		}

	}
}