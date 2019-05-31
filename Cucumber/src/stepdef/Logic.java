package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logic {
	
		
		WebDriver driver;
	@Given("^: Enter the url$")
	public void enter_the_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthik\\eclipse-workspace\\Keerthana\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("user is on FB page");
	    
	}

	//@When("^: user enter the username and password$")
	//public void user_enter_the_username_and_password() throws Throwable {
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("keerthana.raja@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aaa");
//		System.out.println("user entered userame and password");
//
//
//	}


//	@When("^: user enter the \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enter_the_and(String username, String password) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
//	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
//	   
//	}

	@When("^: user enter the login details$")
	public void user_enter_the_login_details(DataTable data) throws Throwable {
List<List<String>> dataraw=   data.raw();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys(dataraw.get(0).get(0));
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(dataraw.get(0).get(1));
		
		
		
		
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}


	@Then("^: click the login btn$")
	public void click_the_login_btn() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("user clicked on the login btn");
	   
	}
}
