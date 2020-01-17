package programs.selenium.chandu;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exam {
	public static void takepicture(WebDriver driver, String filename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".//screenshot//" + filename + ".png"));

	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Share\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		WebElement watch = driver.findElement(By.cssSelector("img[data-image-index=\"3\"]"));
		action.moveToElement(watch).build().perform();

		watch.click();

		Set<String> childwindows = driver.getWindowHandles();

		for (String win : childwindows) {
			if (!parent.equals(win)) {
				driver.switchTo().window(win);
				takepicture(driver, "image1");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.close();

	}
}
