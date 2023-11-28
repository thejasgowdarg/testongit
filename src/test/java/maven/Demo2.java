package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	@Test
	public void deducteepage() throws Exception {
		
		//manster(employee code)
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.25/SaralTDSCB/Authentication/Login.aspx?");
		WebElement finacialyear=driver.findElement(By.xpath("//select[@id=\"ddlFinYear\"]"));
		finacialyear.sendKeys("2023-24");
		WebElement username=driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
		password.sendKeys("admin@009");
		WebElement login=driver.findElement(By.xpath("//input[@id=\"btnLogin\"]"));
		login.click();
		Thread.sleep(2000);
		WebElement searchbranchcode=driver.findElement(By.xpath("//input[@id=\"txtSearch\"]"));
		searchbranchcode.sendKeys("00103");
		WebElement searchbar=driver.findElement(By.xpath("//input[@id=\"imgSearch\"]"));
		searchbar.click();
		Thread.sleep(2000);
		WebElement branch=driver.findElement(By.xpath("//option[@value=\"762\"]"));
		branch.click();
		WebElement select=driver.findElement(By.xpath("//input[@id=\"btnSelect\"]"));
		select.click();
		
		//manster(employee code) data passing code
		
//		WebElement master=driver.findElement(By.xpath("//a[normalize-space()=\"Masters\"]"));
//		 Actions actoin=new Actions(driver);
//		 actoin.moveToElement(master).build().perform();
//		 Thread.sleep(8000);
//		 WebElement emp=driver.findElement(By.xpath("//a[normalize-space()=\"Deductee (Employee)\"]"));
//		 emp.click();
//		 WebElement name = driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_txtEmployeeName\"]"));
//		 name.sendKeys("arun");
//		 WebElement state=driver.findElement(By.xpath("//select[@id=\"ctl00_contentPlaceHolderBody_ddlState\"]"));
//		 state.sendKeys("GOA");
//		 Thread.sleep(2000);
//		 WebElement empfromdate=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_dateFromDate\"]"));
//		 empfromdate.sendKeys("01/04/2023");
//		 WebElement emptodate=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_dateToDate\"]"));
//		 emptodate.sendKeys("31/03/2024");
//		 WebElement pan=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_txtPanReference\"]"));
//		 pan.sendKeys("AYZPJ8899K");
//		 WebElement savebtn=driver.findElement(By.xpath("//input[@id=\"ctl00_contentPlaceHolderBody_btnSave\"]"));
//		 savebtn.click();
//		 Thread.sleep(2000);
//		 driver.switchTo().alert().accept();
//		 Thread.sleep(2000);
//		 driver.switchTo().alert().accept();
//		 Thread.sleep(4000);
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		 WebElement showallbtn=driver.findElement(By.xpath("//input[@name=\"ctl00$contentPlaceHolderBody$btnClear\"]"));
//		 showallbtn.click();
//		 Thread.sleep(5000);
//		 driver.switchTo().alert().accept();
		 
		 //24Q1forn data passing code
		 
		 WebElement form=driver.findElement(By.xpath("//a[normalize-space()=\"Form 24Q\"]"));
		 Actions actoin=new Actions(driver);
		 actoin.moveToElement(form).build().perform();
		 Thread.sleep(4000);
		 WebElement q1action=driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
		 actoin.moveToElement(q1action);
       	 Thread.sleep(2000);
     	 WebElement deductionpage=driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[5]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
		 deductionpage.click();
	}

}
