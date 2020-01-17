package programs.selenium.chandu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteFeature {
	
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toothbrush");
			Thread.sleep(4500);
			for(int i=0;i<5;i++)
			{
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
			}
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
			Thread.sleep(5300);
			driver.close();
		

}
}
