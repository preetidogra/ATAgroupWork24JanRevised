package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login_POM {
	
	WebDriver driver = null;
	LoginPage login;

@Given("Browser is opened")
public void browser_is_opened() {
	System.setProperty("webdriver.chrome.driver","C:/Users/HP/eclipse-workspace/CucumberJavaProject/src/test/resources/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@And("User is on the homepage")
public void user_is_on_the_homepage() {
	
	System.out.println("user is on saucedemo homepage");
	driver.navigate().to("https://www.saucedemo.com");

}

@When("User enters username and password")
public void user_enters_username_and_password() {
	login = new LoginPage(driver);
	
	login.enterUsername("standard_user");
	login.enterPassword("secret_sauce");
	
	System.out.println("user enters login details");
    
	//driver.findElement(By.xpath(" (//input[@id='user-name'])[1]")).sendKeys("standard_user");
    //driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("secret_sauce");

}

@When("User clicks on Login button")
public void user_clicks_on_login_button() {
	login.clickLogin();
	
	//driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
}

@Then("Login is successful")
public void login_is_successful() {
	System.out.println("Saucedemo login is sucesss");
	driver.getPageSource().contains("PRODUCTS");
	   
}




}
