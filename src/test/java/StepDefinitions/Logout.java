package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	
	WebDriver driver = null;
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	    
	    System.setProperty("webdriver.chrome.driver","C:/Users/HP/eclipse-workspace/CucumberJavaProject/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com");
		driver.findElement(By.xpath(" (//input[@id='user-name'])[1]")).sendKeys("standard_user");
	    driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
	    System.out.println(" user is logged in ");
	}

	@And("User clicks on the menu")
	public void user_clicks_on_the_menu() {
	   driver.findElement(By.id("react-burger-menu-btn")).click();
	   System.out.println("menu bar link is clicked");
	}

	@Then("User click on the dropdown list")
	public void user_click_on_the_dropdown_list() {
	    
	    System.out.println("Drop down menu is clicked");
	}

	@When("User clicks on Logout link")
	public void user_clicks_on_logout_link() {
		driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
		System.out.println("Log-Out- link is clicked");
	}

	@Then("User is logged out")
	public void user_is_logged_out() {
	  System.out.println("user logged out now");
	}


}


