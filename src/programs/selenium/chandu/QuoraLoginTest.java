package programs.selenium.chandu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuoraLoginTest 
{
	private WebDriver driver;
	public void QuoraLoginTest(WebDriver driver2)
	{
		driver = driver2;
	}
	private By email=By.name("email");
	private By password=By.name("password");
	private By login=By.name("login");


	//Actions
	private void setUsername()
	{
		driver.findElement(email).sendKeys("CHANDU@gmail.com");
	}
	private void setPassword()
	{
		driver.findElement(password).sendKeys("mercury");
	}
	private void clickOnSignin()
	{
		driver.findElement(login).click();
	}
	public void login()
	{
	this.setUsername();
	this.setPassword();
	this.clickOnSignin();
	}	
	public static void main(String[] args)
	{
		 	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
		 	WebDriver driver=new ChromeDriver();
			driver.get("https://www.quora.com/");		
			QuoraLoginTest obj=new QuoraLoginTest();
			//obj.QuoraLoginTest(driver);
			obj.login();
	}

}


