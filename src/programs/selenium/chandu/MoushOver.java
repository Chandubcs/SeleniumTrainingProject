package programs.selenium.chandu;

import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;



public class MoushOver {
	public static void takepicture(WebDriver driver,String filename) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(".//screenshots//"+filename+".png"));
	
	}
	public static void main(String[] args) throws Exception
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://in.ebay.com/");
		 takepicture(driver,"image1");
		 Actions action=new Actions(driver);
		 WebElement electronics=driver.findElement(By.linkText("Electronics"));
		 action.moveToElement(electronics).build().perform();
		 takepicture(driver,"image2");
		 Thread.sleep(2500);
		 WebElement samsung=driver.findElement(By.linkText("Samsung"));
		 action.moveToElement(samsung).build().perform();
		 takepicture(driver,"image3");
		 Thread.sleep(3400);
		 samsung.click();
		 takepicture(driver,"image4");	 
		 
	}

}
