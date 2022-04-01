package git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Git {
	WebDriver driver;
	@Test
	private void tc01() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		}
@Test
private void tc02() {
WebElement username = driver.findElement(By.id("email"));
username.sendKeys("ilango");
WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys("1232");
}



}
