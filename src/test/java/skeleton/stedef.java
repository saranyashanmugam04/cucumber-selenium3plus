package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class stedef {
	WebDriver driver;
	
	@Given("User should launch chrome browser")
	public void user_should_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@Given("User should navigates to application")
	public void user_should_navigates_to_application() {
		driver.get("http://newtours.demoaut.com");
	}

	@Given("user clicks on register link")
	public void user_clicks_on_register_link() {
		driver.findElement(By.linkText("REGISTER")).click();
	}	

	@Given("user enter username")
	public void user_enter_username() {
		driver.findElement(By.name("email")).sendKeys("mercury");

	}

	@Given("user enter password")
	public void user_enter_password() {
		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@Given("user enter confirmpassword")
	public void user_enter_confirmpassword() {
		driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
	}

	@Given("user click on Register button")
	public void user_click_on_Register_button() {
		driver.findElement(By.name("register")).click();
	}

	@Given("user should validates Registrtaion success")
	public void user_should_validates_Registrtaion_success() {
		Assert.assertEquals("Register", driver.getTitle().contains("Register"));
	  
	}

}
