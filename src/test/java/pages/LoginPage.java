package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver; //object created 
	
By username_login = By.xpath("//input[@id='user-name'])[1]");
By password_login = By.xpath("(//input[@id='password'])[1]");
By btn_login = By.id("login-button");
By btn_logout = By.xpath("(//a[normalize-space()='Logout'])[1]");

//constructor  
public LoginPage(WebDriver driver)
{
	this.driver = driver; //this.driver refers to the driver in same class
}

//methods created to run objects
public void enterUsername(String username)
{
	driver.findElement(username_login).sendKeys(username);
}

public void enterPassword(String password)
{
	driver.findElement(password_login).sendKeys(password);
}

public void clickLogin()
{
	driver.findElement(btn_login).click();
}

public void logOutIsDisplayed()
{
	driver.findElement(btn_logout).click();
} 

/*public void loginValiduser(String username, String password) {
	
	driver.findElement(username_login).sendKeys(username);
	driver.findElement(password_login).sendKeys(password);
	driver.findElement(btn_login).click();

}*/



}
