package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.Homepage;
import pageLayer.Loginpage;

public class LoginTestcase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Homepage home_obj = new Homepage(driver);
		home_obj.clickOnLoginLink();
		
		Loginpage login_obj = new Loginpage(driver);
		login_obj.enterUsername("testacc3");
		login_obj.enterPassword("test");
		login_obj.clickOnLoginButton();
	}
}
