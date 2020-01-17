package programs.selenium.chandu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	 public  void function()
	 {
		 //Only static methods can call static methods
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.com");
				
	 }
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.function();
		
	}

 
}

