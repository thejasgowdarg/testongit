package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newdemo {
	@Test
	public void ren() throws Exception {
		
		//login and branch login code
		
		WebDriverManager.chromedriver().setup();
		 ChromeOptions ops = new ChromeOptions();
		 ops.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(ops);
		 driver.manage().window().maximize();
		 driver.get("http://192.168.2.25/SaralTDSJK/Authentication/login.aspx");
		 WebElement financeyear= driver.findElement(By.id("ddlFinYear"));
		 financeyear.sendKeys("2023-24");		
	     WebElement username  =driver.findElement(By.id("txtUsername"));
		 username.sendKeys("admin");
		 WebElement password=driver.findElement(By.id("txtPassword"));
		 password.sendKeys("admin@009");
	     WebElement loginbutton=driver.findElement(By.id("btnLogin"));
	     loginbutton.click();
		 Select locationdropdown=new Select(driver.findElement(By.id("lstBranches")));
		 locationdropdown.selectByVisibleText("ACHABAL, ANANTNAG - 1256");
		 Thread.sleep(3000);
         WebElement selectbutton=driver.findElement(By.id("btnSelect"));
         selectbutton.click();
         
         //master deducteemp page and passing data code
         
         WebElement master=driver.findElement(By.xpath("//a[normalize-space()=\"Masters\"]"));
         Actions actoin=new Actions(driver);
         actoin.moveToElement(master).build().perform();
         WebElement deducteeemploye=driver.findElement(By.xpath("//a[normalize-space()=\"Deductee (Employee)\"]"));
         deducteeemploye.click();
         Thread.sleep(3000);
         WebElement deductieename=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_txtEmployeeName\"]"));
         deductieename.sendKeys("Thejas");
         WebElement state = driver.findElement(By.xpath("//select[@id=\"ctl00_contentPlaceHolderBody_ddlState\"]"));
         state.sendKeys("GOA");
         Thread.sleep(3000);
         WebElement refernceno=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_txtReferenceNo\"]"));
         refernceno.sendKeys("4545444");
         Thread.sleep(3000);
         WebElement empfromdate=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_dateFromDate\"]"));
         empfromdate.sendKeys("01/04/2023");
         Thread.sleep(2000);
         WebElement emptodate = driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_dateToDate\"]"));
         emptodate.sendKeys("31/03/2024");
         Thread.sleep(2000);
        //WebElement pan=driver.findElement(By.xpath("//select[@id=\"ctl00_contentPlaceHolderBody_ddlPan\"]"));
        
         WebElement panentry=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_txtPanReference\"]"));
         panentry.sendKeys("AYZPT7788B");
         Thread.sleep(2000);
         WebElement save=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btnSave\"]"));
         save.click();
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
      	Thread.sleep(2000);
     	driver.switchTo().alert().accept();
     	Thread.sleep(2000);
     	JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 WebElement showallbtn=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btnClear\"]"));
		 showallbtn.click();
		 Thread.sleep(2000);
	     driver.switchTo().alert().accept();
	     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	     Thread.sleep(4000);
	     
	     //deduction page data passing code
	     
	 	 WebElement form24= driver.findElement(By.xpath("//a[text()=\"Form 24Q\"]"));
		 actoin.moveToElement(form24).build().perform();
		 WebElement form24q1=driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
		 actoin.moveToElement(form24q1).build().perform();
		driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[5]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
		Thread.sleep(4000);
		WebElement name=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_txtName\"]"));
		name.sendKeys("Th");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_contentPlaceHolderBody_autoCompleteExtender_completionListElem\"]/li")).click();
		Thread.sleep(2000);
		Select sectiondrop=new Select(driver.findElement(By.xpath("//select[@name=\"ctl00$contentPlaceHolderBody$ddlSection\"]")));
		sectiondrop.selectByVisibleText("92A - Payment of Salaries");
		Thread.sleep(2000);
		WebElement payment=driver.findElement(By.xpath("//input[@name=\"ctl00$contentPlaceHolderBody$txtAmountOfPayment\"]"));
		payment.sendKeys("459868");
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//input[@name=\"ctl00$contentPlaceHolderBody$txtCreditedDate\"]"));
		date.sendKeys("01/04/2023");
		Thread.sleep(2000);
		WebElement tdsamount = driver.findElement(By.xpath("//input[@name=\"ctl00$contentPlaceHolderBody$txtIncomeTaxAmount\"]"));
		tdsamount.sendKeys("77");
		Thread.sleep(2000);
		WebElement datefield=driver.findElement(By.xpath("//input[@name=\"ctl00$contentPlaceHolderBody$txtTaxDedDate\"]"));
		datefield.click();
		WebElement savebutton = driver.findElement(By.xpath("//input[@name=\"ctl00$contentPlaceHolderBody$btnSave\"]"));
		savebutton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement showall1=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btnClear\"]"));
		showall1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);
		
		//challan page code
		
		 WebElement form24cch= driver.findElement(By.xpath("//a[text()=\"Form 24Q\"]"));
        actoin.moveToElement(form24cch).build().perform();
		 WebElement form24q1ch=driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
		 actoin.moveToElement(form24q1ch).build().perform();
		 Thread.sleep(2000);
		 WebElement challanpage=driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[5]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
		 challanpage.click();
		 Thread.sleep(5000);
		 WebElement fromded=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btnFromDeduction\"]"));
		 fromded.click();
		 Thread.sleep(2000);
		 WebElement checkbox=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_rptrUnlinkedDeduction_ctl01_chkSelect\"]"));
		 checkbox.click();
		 WebElement caluclate=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btnDeductionAmount\"]"));
		 
			js.executeScript("arguments[0].scrollIntoView();",caluclate );
		 caluclate.click();
		 Thread.sleep(2000);
			 WebElement create=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btnDeductionLink\"]"));
			 js.executeScript("arguments[0].scrollIntoView();",create );
			 create.click();
			 WebElement natureofpay=driver.findElement(By.xpath("//select[@id=\"ctl00_contentPlaceHolderBody_cmbNatureOfPayment\"]"));
			 natureofpay.sendKeys("92A - Payment of Salaries");
			 WebElement typeoypay=driver.findElement(By.xpath("//select[@id=\"ctl00_contentPlaceHolderBody_ddlMinorHead\"]"));
			 typeoypay.sendKeys("200-Payable by Taxpayer");
			 WebElement modeofpay=driver.findElement(By.xpath("//select[@id=\"ctl00_contentPlaceHolderBody_cmbModeOfPayment\"]"));
			 modeofpay.sendKeys("Cash/ePayment");
			 WebElement challanno=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_txtBankChallanNo\"]"));
			 challanno.sendKeys("55555");
			 WebElement challandate=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_dateeditPaidDate\"]"));
			 challandate.sendKeys("01/04/2023");
			 Thread.sleep(2000);
			 WebElement bsrcode = driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_txtBankCode\"]"));
			 bsrcode.sendKeys("00");
			 Thread.sleep(2000);
			 WebElement bsrcodeclick =driver.findElement(By.xpath("//*[@id=\"ctl00_contentPlaceHolderBody_AutoCompleteExtender1_completionListElem\"]/li[3]"));
			 bsrcodeclick.click();
			 Thread.sleep(2000);
			 WebElement savebutton1=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btnSave\"]"));
			 savebutton1.click();
			 Thread.sleep(2000);
			 driver.switchTo().alert().accept();
			 Thread.sleep(2000);
			 driver.switchTo().alert().accept();
			 Thread.sleep(3000);
			 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			 Thread.sleep(3000);
			 
			 //ertuen page code
			 
			  WebElement form24cch1= driver.findElement(By.xpath("//a[text()=\"Form 24Q\"]"));
			  
		      actoin.moveToElement(form24cch1).build().perform();
		      WebElement form24q1ch2=driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
			  actoin.moveToElement(form24q1ch2).build().perform();
			  Thread.sleep(2000);
			  WebElement erturnpageclk=driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[5]/table[1]/tbody[1]/tr[11]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
			  erturnpageclk.click();
			  Thread.sleep(2000);
			  WebElement uploadfile=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_fileUpload\"]"));
			  
			  
			  js.executeScript("arguments[0].scrollIntoView();",uploadfile );
			  uploadfile.sendKeys("C:\\Users\\Tulasikumar\\Desktop\\New folder (36)\\excel\\New folder (2)\\BLRA00198C050423.csi");
			  Thread.sleep(2000);
			  WebElement erturnclick=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btneReturn\"]"));
			  erturnclick.click();
			  Thread.sleep(2000);
			  driver.switchTo().alert().accept();
			  Thread.sleep(2000);
			  driver.switchTo().alert().accept();
	}

}
