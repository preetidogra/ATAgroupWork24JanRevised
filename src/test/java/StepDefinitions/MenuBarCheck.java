/*package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MenuBarCheck {
	
	WebDriver driver = null;
	
	@Given("user has logged in")
	public void user_has_logged_in() {	    
		System.setProperty("webdriver.chrome.driver","C:/Users/HP/eclipse-workspace/CucumberJavaProject/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/inventory.html");

	}

	@Given("user clicks the menu bar")
	public void user_clicks_the_menu_bar() {
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).sendKeys(Keys.ENTER);
		System.out.println("menu bar is clickable");
	    
	}

} */
