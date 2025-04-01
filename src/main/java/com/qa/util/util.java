
package com.qa.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



@SuppressWarnings("unused")
public  class util {
	
	
	
	
	public static class RandomAlphanumericString {

	    public static String generateRandomAlphanumericString() {
	        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6);
	    }
	}
	public static void executeKeyPressCombination(int times) {

	     {
	        try {
	            Robot robot = new Robot();

	            for (int i = 0; i < times; i++) {
	                robot.keyPress(KeyEvent.VK_CONTROL);
	                robot.keyPress(KeyEvent.VK_MINUS);
	                robot.keyRelease(KeyEvent.VK_CONTROL);
	                robot.keyRelease(KeyEvent.VK_MINUS);
	            }

	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	    }
	}
	public void JSClick(WebElement element, WebDriver driver) {

		try {
			// element = driver.findElement(locator);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception ex) {
			System.out.println(ex);

		}
	}
	
		
	public void JSView(WebElement element, WebDriver driver) {

		try {
			// element = driver.findElement(locator);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView(true);",element);

		} catch (Exception ex) {
			System.out.println(ex);

		}
		
		
		
		
		
		
		
		
	}
	public void JSViewHorizontal(WebDriver driver) {

		try {
			// element = driver.findElement(locator);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(2000,0);");

		} catch (Exception ex) {
			System.out.println(ex);

		}
	}


	public void JSEnterText(WebElement element, WebDriver driver, String strData) {

		// element = driver.findElement(locator);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value = '" + strData + "'", element);
	}

	public void ActionClick(WebElement element, WebDriver driver) {

		Actions act = new Actions(driver);

		// act.moveToElement(element).pause(1000).click().build().perform();

		// act.moveToElement(element).click().build().perform();

		act.click(element).perform();

	}

	public void rightClick(WebDriver driver, By locator, WebElement element) {

		element = driver.findElement(locator);

		Actions act = new Actions(driver);

		act.contextClick(element).build().perform();

	}

	public void MoveElement(WebElement element, WebDriver driver) {

		try {
			Actions mov = new Actions(driver);

			// waitForElement(locator, driver);

			mov.moveToElement(element);

			mov.build().perform();

		} catch (Exception e) {
			System.out.println("Not Able to Move");

			// logger("Steps","MoveElement", e);

		}
	}

	public void ChildWindow(WebDriver driver) {
		try {
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles();

			System.out.println(handles.size());

			Iterator<String> iterator = handles.iterator();

			while (iterator.hasNext()) {
				subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);
//            driver.manage().window().maximize();
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			System.out.println("Winow not handled");

			// logger("Steps","Window", e);

		}
	}
	public void SwitchToChildWindow(WebDriver driver, String windowtitle) {
		try {
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles();

			System.out.println(handles.size());

			Iterator<String> iterator = handles.iterator();

			while (iterator.hasNext()) {
				subWindowHandler = iterator.next();
				driver.switchTo().window(subWindowHandler);
				System.out.println(driver.getTitle());
				if (driver.getTitle().trim().equals(windowtitle)) {
					break;
				}
				;

			}

			System.out.println(driver.getTitle());
		} catch (Exception e) {
			System.out.println("Winow not handled");

			// logger("Steps","Window", e);

		}
	}

	public void Window(WebDriver driver) {
		try {
			((JavascriptExecutor) driver).executeScript("window.showModalDialog =window.open;");
			
			System.out.println("Modal pop window converted to Normal window");
		} catch (Exception e) {
			System.out.println("Modal pop window not converted to Normal window");
		}
	}

	public void ChildWindowforPrescription(WebDriver driver) {
		try {
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles();
			System.out.println(handles.size());

			Iterator<String> iterator = handles.iterator();

			while (iterator.hasNext()) {
				subWindowHandler = iterator.next();

				driver.switchTo().window(subWindowHandler);
				System.out.println(driver.getTitle());

				if (driver.getTitle().contains("ClientSide_Prescriptions")) {

					break;

				}

			}

			System.out.println(driver.getTitle());
		} catch (Exception e) {
			System.out.println("Winow not handled");

			// logger("Steps","Window", e);

		}
	}
	
	public void ChildWindowSwitch(WebDriver driver, By locators) {
		try {
			String subWindowHandler = null;
			String paWindow = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			System.out.println(handles.size());

			Iterator<String> iterator = handles.iterator();

			while (iterator.hasNext()) {
				subWindowHandler = iterator.next();
				if(!paWindow.equals(subWindowHandler)) {
				driver.switchTo().window(subWindowHandler);
				System.out.println(driver.getTitle());
				
				int elecount = driver.findElements(locators).size();
				if(elecount==1) {
					break;
				}
				
				else {
					continue;
				}
				
				}

			}

			System.out.println(driver.getTitle());
		} catch (Exception e) {
			System.out.println("Winow not handled");

			// logger("Steps","Window", e);

		}
	}


	public String GetCheckinNumberText(WebElement strElement, WebDriver driver) {
		String strtext = (strElement.getText());
		String strtextcheckin[] = strtext.split(" ");

		String Checkinnumber = strtextcheckin[2];

		return Checkinnumber;

	}

	public void selectDropdown(WebElement strElement, WebDriver driver, String strData,String Browser ) {
	
		if(Browser.equalsIgnoreCase("Firefox")|| Browser.equalsIgnoreCase("Edge"))
		try {

			Select dropdownValue = new Select(strElement);

			dropdownValue.selectByVisibleText(strData);

		}

		catch (Exception e) {
			System.out.println("Dropdown hasn't selected");

			// logger("Steps","selectDropdown", e);

		}
		else if (Browser.equalsIgnoreCase("Chrome")||Browser.equalsIgnoreCase("Opera")) {
			strElement.sendKeys(strData);
			
		}

	}
//	dropdownValue.selectByValue(strData);
	public void selectDropdownByValue(WebElement strElement, WebDriver driver, String strData,String Browser ) {
		
		if(Browser.equalsIgnoreCase("Firefox")|| Browser.equalsIgnoreCase("Edge"))
		try {

			Select dropdownValue = new Select(strElement);

			dropdownValue.selectByValue(strData);

		}

		catch (Exception e) {
			System.out.println("Dropdown hasn't selected");

			// logger("Steps","selectDropdown", e);

		}
		else if (Browser.equalsIgnoreCase("Chrome")||Browser.equalsIgnoreCase("Opera")) {
			strElement.sendKeys(strData);
			
		}

	}

	public void selectDropdownValue(List<WebElement> strElement, WebDriver driver, String strData) {
		try {
			/*
			 * //wait ForElement(strElement);
			 * 
			 * //Hashtable ht = new Hashtable(); System.out.println(strElement.getText());
			 * 
			 * Select dropdownValue = new Select(strElement); //
			 * dropdownValue.deselectAll();
			 * 
			 * dropdownValue.selectByValue(strData);
			 * 
			 */
//			/List<WebElement> ls = strElement.size();
			
			int lssize = strElement.size();
			
			for(int i=0;i<lssize;i++) {
				System.out.println(strElement.get(i).getText());
				if(strElement.get(i).getText().equalsIgnoreCase(strData))
				{
					strElement.get(i).click();
					break;
				}
			}
			

		}

		catch (Exception e) {
			System.out.println("Dropdown hasn't selected");

			// logger("Steps","selectDropdown", e);

		}

	}

	/*
	 * public void waitForElement(WebElement strElement) { try { for (int i=0;
	 * i<120; i++) { strElement.isDisplayed(); Thread.sleep(2000); break; } }
	 * 
	 * catch (Exception e) { System.out.println("Not Able to Find Element");
	 * 
	 * //logger("Steps","waitForElement", e);
	 * 
	 * } }
	 */
	
	public void waitForalert(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.alertIsPresent());
		}

		catch (Exception e) {
			System.out.println("Not Able to Find Element");


		}
	}
	public void changeLocationFacility(WebDriver driver) {
		try {
			
			driver.findElement(By.id("ctl00_lnkbtnChangeHospital")).click();
			
		}

		catch (Exception e) {
			System.out.println("Not Able to click");

			// logger("Steps","waitForElement", e);

		}
	}
	public void scroolDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
	}
	public void scroolUP(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(document.body.scrollHeight,0)");
		
	}
	public void scroolDownintoview(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	}
	public String GetCheckinNumberText2(WebElement strElement, WebDriver driver) {
		String strtext = (strElement.getText());
		//String strtextcheckin[] = strtext.split(" ");

		//String Checkinnumber = strtextcheckin[0];

		//return Checkinnumber;
return strtext;
	}
	public String getScreenshot(WebDriver driver,String ScreenShootname) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy hh:mm aaa");
		 Calendar cal = Calendar.getInstance();
		String dateName=sdf.format(cal.getTime());
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		String destination=System.getProperty("user.dir") + "/FailedTestsScreenshots/" +ScreenShootname+"-"+dateName + ".png";
		
	       
		File finalDestination=new File(destination);
		try{
		FileUtils.copyFile(source, finalDestination);
		}
		catch(IOException e){
			System.out.println("Capture Failed" +e.getMessage());
		}
		return destination;
		
	}
	public  String getScreenshot2(WebDriver driver,String ScreenShootname) {
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
       
        	String destination=System.getProperty("user.dir") + "/FailedTestsScreenshots/" +ScreenShootname+dateName + ".png";
            try {
				ImageIO.write(screenshot.getImage(),"PNG",new File(destination));
			} catch (IOException e) {
				e.printStackTrace();
			}
       
        
        
        
        return destination;
	}
public void genratePDF(WebDriver driver) throws DocumentException, MalformedURLException, IOException {
	
	// take the screenshot and store it in byte[] array format
	byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	Document document = new Document();
    String output = "E:\\BrowserCompatibility_HIS\\CDR.pdf";
   // String output = "D:\\AutomationESIC\\AutomationESIC\\AutomationESIC\\Reports\\CDR.pdf";
    FileOutputStream fos = new FileOutputStream(output);

    // Instantiate the PDF writer
    PdfWriter writer = PdfWriter.getInstance(document,fos);


    writer.open();
    document.open();

    // process content into an image

    	
    	
    	Image  im = Image.getInstance(input);

    //set the size of the image
    im.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());

    // add the image to PDF
    document.newPage();
    document.add(im);
    
    document.add(new Paragraph("test"));
    
    //close the files and write to local system
    document.close();
    writer.close();
    

}
public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{

    //Create an object of File class to open xlsx file

    File file =    new File(filePath+"\\"+fileName);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook guru99Workbook = null;

    //Find the file extension by splitting  file name in substring and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    guru99Workbook = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of XSSFWorkbook class

        guru99Workbook = new HSSFWorkbook(inputStream);

    }    

//Read excel sheet by sheet name    

Sheet sheet = guru99Workbook.getSheet(sheetName);

//Get the current count of rows in excel file

int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

//Get the first row from the sheet

Row row = sheet.getRow(0);

//Create a new row and append it at last of sheet

Row newRow = sheet.createRow(rowCount+1);

//Create a loop over the cell of newly created Row

for(int j = 0; j < row.getLastCellNum(); j++){

    //Fill data in row

     Cell cell = newRow.createCell(j);

    cell.setCellValue(dataToWrite[j]);

}

//Close input stream

inputStream.close();

//Create an object of FileOutputStream class to create write data in excel file

FileOutputStream outputStream = new FileOutputStream(file);

//write data in the excel file

guru99Workbook.write(outputStream);

//close output stream

outputStream.close();

}
public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

    //Create an object of File class to open xlsx file

    File file =    new File(filePath+"\\"+fileName);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook guru99Workbook = null;

    //Find the file extension by splitting file name in substring  and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    guru99Workbook = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of HSSFWorkbook class

        guru99Workbook = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name

    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

    //Find number of rows in excel file

    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
    System.out.println(rowCount);

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = guru99Sheet.getRow(i);//i

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");//j

        }

        System.out.println();
    } 

    }  

  
}
