package step_definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage 
{
public WebDriver driver;

	
	
	@Given("^Chrome Browser Open$")
	public void chrome_Browser_Open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Batch69\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  Thread.sleep(2000);
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Then("^Enter the URL$")
	public void enter_the_URL() throws InterruptedException
	{
		Thread.sleep(2000);
	driver.get("https://www.amazon.in/");    
	}

	@Then("^Move to Hello Sigin In Element$")
	public void move_to_Hello_Sigin_In_Element() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList-nav-line-1")));
		WebElement helloSignIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions action = new Actions(driver);
	 action.moveToElement(helloSignIn).perform();
	
	}

	@Then("Click on Sigin In Button")
	public void click_on_Sigin_In_Button() throws InterruptedException {
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	}

	@Then("Enter Mobile Number or Email ID")
	public void enter_Mobile_Number_or_Email_ID() throws InterruptedException {
		Thread.sleep(2000);
	  driver.findElement(By.id("ap_email")).sendKeys("8711013119");
	}

	@Then("Click on Continue Button")
	public void click_on_Continue_Button() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.id("continue")).click();
	}

	@Then("Enter Invalid Password")
	public void enter_Invalid_Password() throws InterruptedException {
		Thread.sleep(2000);
	   driver.findElement(By.id("ap_password")).sendKeys("12344444");
	}

	@Then("Click on Login Button")
	public void click_on_Login_Button() throws InterruptedException {
		Thread.sleep(2000);
	  driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("Validate Error Msg")
	public void validate_Error_Msg() throws InterruptedException
	{
		Thread.sleep(2000);
	WebElement loginPageErrorMsg = driver.findElement(By.xpath("//span[contains(text(),'Your password is incorrect')]"));
	
	Assert.assertTrue(loginPageErrorMsg.isDisplayed());
	System.out.println("*******Error Msg Valoidated Successfully****");
	}
}
