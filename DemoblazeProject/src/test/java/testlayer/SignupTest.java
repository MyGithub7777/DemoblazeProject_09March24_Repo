package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.Homepage;
import pageLayer.Signuppage;

public class SignupTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Homepage homepage_obj = new Homepage(driver);
		homepage_obj.clickOnSignupLink();
		
		Signuppage signup_obj = new Signuppage(driver);
		
		signup_obj.enterUsername("jontest1");
		signup_obj.enterPassword("test");
		signup_obj.clickOnSignupButton();
		
		
	}
}
