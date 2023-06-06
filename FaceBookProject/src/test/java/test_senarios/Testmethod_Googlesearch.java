package test_senarios;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testmethod_Googlesearch<GoogleSearchPage, FacebookPage> {

	WebDriver driver;
	GoogleSearchPage GoogleSearchPage;

	FacebookPage FacebookPage;

	@BeforeTest
	public void beforetest() {
		// WebDriverManager.chmedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts(). implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void SearchOperation() throws InterruptedException {
		GoogleSearchPage page = new GoogleSearchPage(driver);
		// page.click();
		page.searchgoogle("facebook");
		
		

		// Thread.sleep(5000);
	}

	@Test
	public void VerifyandAccessFacebook() throws InterruptedException {
		GoogleSearchPage page = new Googlesearch(driver);

		page.ClickFacebook();
	}

	@Test
	public void VerifyLoginfunctionality() throws InterruptedException {
		FacebookPage page1 = new FacebookPage(driver);

		page1.EnterUsername();
		page1.EnterPassword();
		page1.VerifyLogin();
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}	