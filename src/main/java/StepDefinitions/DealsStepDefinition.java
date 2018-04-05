/*package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefinition {

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
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		
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
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_contact_page() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]")));
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		
	}
	@Then("^user enters deal details$")
	public void user_enters_contacts_details(DataTable dealData) {
		List<List<String>> dataValues = dealData.raw();
		driver.findElement(By.id("title")).sendKeys(dataValues.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dataValues.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dataValues.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dataValues.get(0).get(3));
		
		
	}
	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
*/