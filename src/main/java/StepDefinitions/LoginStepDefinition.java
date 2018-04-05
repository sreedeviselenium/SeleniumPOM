/*package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		
		
		
	}

@When("^title of login page is Free CRM$")
public void title_of_login_page_is_free_CRM() {
	String title = driver.getTitle();
	System.out.println(title);
	//Assert.assertEquals(expected, actual);
}
@Then("^user enters \"(.*)\" and \\\"(.*)\\\"$")
public void user_enters_username_and_password(String username, String password) {
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	
}
@Then("^user clicks on login button$")
public void user_clicks_on_login_button() {
	driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	
}
@Then("^user is on home page$")
public void user_is_on_home_page() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("CRMPRO", title);
}
@Then("^user moves to new contact page$")
public void user_moves_to_new_contact_page() throws InterruptedException {
	driver.switchTo().frame("mainpanel");
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
	driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	
}
@Then("^user enters contact details \\\"(.*)\\\" and \\\"(.*)\\\" and \\\"(.*)\\\"$")
public void user_enters_contacts_details(String firstname, String lastname, String position) {
	driver.findElement(By.id("first_name")).sendKeys(firstname);
	driver.findElement(By.id("surname")).sendKeys(lastname);
	driver.findElement(By.id("company_position")).sendKeys(position);
	driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	
}
@Then("^Close the browser$")
public void close_the_browser() {
	driver.quit();
}
}*/