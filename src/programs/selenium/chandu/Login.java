package programs.selenium.chandu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
		private WebDriver driver;
		public Login(WebDriver driver2)
		{
			driver2=driver2;
		}
		private By username=By.name("username");
		private By password=By.name("password");
		private By signinbtn=By.name("login");
		 //Actions
		private void setUsername()
		{
			driver.findElement(username).sendKeys("mercury");
		}
		private void setPassword()
		{
			driver.findElement(password).sendKeys("mercury");
		}
		private void clickOnSignin()
		{
			driver.findElement(signinbtn).click();
		}
		public void login()
		{
			this.setUsername();
			this.setPassword();
			this.clickOnSignin();
		}

}



