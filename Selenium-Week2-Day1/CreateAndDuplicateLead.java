package Week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAndDuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			// Thread.sleep(5000);
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			String title = driver.getTitle();	
			String ogTitle ="Leaftaps - TestLeaf Automation Platform";
			
				if(title.equalsIgnoreCase(ogTitle))
				{
				System.out.println("Title Verification Passed");	
				}
				else {
					System.out.println("Verifiaction Failed");
				}
				
			
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("MS");
			driver.findElementById("createLeadForm_firstName").sendKeys("Ragavan");
			driver.findElementById("createLeadForm_lastName").sendKeys("P");
			driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Raan");
            driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr.");
            driver.findElementById("createLeadForm_generalProfTitle").sendKeys("SAMPLE");
            WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		    Select selSource=new Select(source);
            selSource.selectByValue("LEAD_PR");
            driver.findElementById("createLeadForm_annualRevenue").sendKeys("1 crore");
            WebElement dd = driver.findElementById("createLeadForm_industryEnumId");
		    Select item=new Select(dd);
            item.selectByValue("IND_HEALTH_CARE");
            WebElement industryDd = driver.findElementById("createLeadForm_ownershipEnumId");
		    Select ownership =new Select(industryDd);
		    ownership.selectByIndex(5);
		    driver.findElementById("createLeadForm_sicCode").sendKeys("cfr121");
		    driver.findElementById("createLeadForm_description").sendKeys("Test Content");
		    driver.findElementById("createLeadForm_importantNote").sendKeys("Not applicable");
		    driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		    driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("605454");
		    driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("3512");
		    driver.findElementById("createLeadForm_primaryEmail").sendKeys("ragu021194@gmail.com");
		    driver.findElementById("createLeadForm_generalToName").sendKeys("Ragavan.P");
		    driver.findElementById("createLeadForm_generalAddress1").sendKeys("Raja Street");
		    driver.findElementById("createLeadForm_generalCity").sendKeys("Villupuram");
		    driver.findElementById("createLeadForm_generalPostalCode").sendKeys("6054011");
		    driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("605");
		    WebElement marketCampain = driver.findElementById("createLeadForm_marketingCampaignId");
		    Select mCampain =new Select (marketCampain);
		    mCampain.selectByValue("CATRQ_CARNDRIVER");
		    driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Ragu");
		    driver.findElementById("createLeadForm_birthDate").sendKeys("02/11/1944");
		    driver.findElementById("createLeadForm_departmentName").sendKeys("CSE");
		    WebElement prefCurreny = driver.findElementById("createLeadForm_currencyUomId");
		    Select currency =new Select (prefCurreny);
		    currency.selectByValue("INR");
		    driver.findElementById("createLeadForm_numberEmployees").sendKeys("107");
		    driver.findElementById("createLeadForm_tickerSymbol").sendKeys("@#@#");
		    driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("789456130");
		    driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Admin");
		    driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/");
		    driver.findElementById("createLeadForm_generalAttnName").sendKeys("Squad");
            driver.findElementById("createLeadForm_generalAddress2").sendKeys("chennai");
		    WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		    Select location = new Select (country);
		    location.selectByValue("IND");
		    Thread.sleep(3000);
		    WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		    Select st = new Select (state);
		    st.selectByIndex(27);
		    Thread.sleep(3000);
		    driver.findElementByClassName("smallSubmit").click();
		    driver.findElementByLinkText("Duplicate Lead").click();
		    driver.findElementById("createLeadForm_companyName").clear();
		    driver.findElementById("createLeadForm_companyName").sendKeys("Google");
		    driver.findElementByClassName("smallSubmit").click();
		    WebElement duplicateName=driver.findElementById("viewLead_companyName_sp");
		    String verifyName=duplicateName.getText();
		    String dupName ="Google";
		    if(verifyName.contains(dupName))
		    {
		    	
		    	System.out.println("Duplicate Company Name Verified Successfully");
		    }
		    else {
		    	System.out.println("Verification Failed");
		    }
		    
		    
		    driver.close();
		    
		    
		    
		    
		
            
			
	}

	
		
				
	}

