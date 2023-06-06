package objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Googlesearch {

	
	WebDriver driver;
	public Googlesearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
	By searchbox = By.xpath("//input[@name='q']"); 
	By Search_btn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"); 
	By Facebook_link = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3");

	public void searchgoogle(String Searchinput) { // TODO Auto-generated method stub

		try {

		//driver.findElement(clickONButton).click(); driver.findElement (searchbox).sendKeys(Searchinput);

		Thread.sleep(1000);

		driver.findElement(Search_btn).click();

		Thread.sleep(2000); } catch (Exception e) {

		System.out.println("Exceptions Caught" + e.getMessage());

		}

		}

		public void ClickFacebook() {

		// TODO Auto-generated method stub

		try {

		driver.findElement (Facebook_link).click(); Thread.sleep(2000);

		} catch (Exception e) {

		System.out.println("Exceptions Caught" + e.getMessage());

		}
		
		}
}