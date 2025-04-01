package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.util;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class vijaymam {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int amount=0;
		util utilobj=new util();
//		ChromeOptions opt = new ChromeOptions();
//		
//		opt.addArguments("start-maximized");
//		
//		opt.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
//		
//		WebDriverManager.chromedriver().version("2.40").setup();
//		driver = new ChromeDriver(opt);
//		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
//		driver = new FirefoxDriver();
		//driver.get("https://www.path2usa.com/travel-companion/");
	/*	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;//
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		//scrool in to table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		//how to sum the value in table
		List<WebElement> list=driver.findElements(By.xpath("//html//body//div[@class='tableFixHead']//table[@id='product']//tbody//tr"));
		System.out.println(list.size());
		for(int i=1;i<=list.size();i++) {
			String Amountvalue=driver.findElement(By.xpath("//html//body//div[@class='tableFixHead']//table[@id='product']//tbody//tr["+i+"]//td[4]")).getText();
		System.out.println(Amountvalue);
		amount=amount+Integer.parseInt(Amountvalue);
		//System.out.println(amount);
		}
		System.out.println("the total Amount is:- "+amount);
		String ExpectedResult=driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[2]")).getText();
		System.out.println(ExpectedResult);
		String Valueget=ExpectedResult.substring(24, ExpectedResult.length());
		System.out.println(Valueget);
		int expectedResult=Integer.parseInt(Valueget);
		System.out.println(expectedResult);
		assertEquals(amount, expectedResult);
		System.out.println("value is match your test is passed");*/
		
		
		
		//how to bypass ssl certification https://expired.badssl.com
		
/*ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("start-maximized");
		opt.setAcceptInsecureCerts(true);
		
		opt.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriverManager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver(opt);
		
		driver.get("https://expired.badssl.com/");
*/		
ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("start-maximized");
		opt.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");		
		WebDriverManager.chromedriver().browserVersion("2.40").setup();
		driver = new ChromeDriver(opt);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//give counts of link on the page,count link in footer section
List<WebElement> list=driver.findElements(By.tagName("a"));
System.out.println(list.size());
for(int i=0;i<=list.size();i++) {
	if(!list.get(i).getText().isEmpty()) {
		System.out.println(list.get(i).getAttribute("href"));
		list.get(i).click();		
		driver.navigate().back();
		list=driver.findElements(By.tagName("a"));
		
	}
	//System.out.println(driver.findElement(By.tagName("a")).getAttribute("href"));
}
		
	}
	

}
