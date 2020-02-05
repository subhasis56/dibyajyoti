package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginactitime 
{
	public WebDriver driver;
	//Declaration
		@FindBy(id="username")
		private WebElement usernametextfield;
		
		@FindBy(name="pwd")
		private WebElement passwordtextfield;
		
		@FindBy(id="loginButton")
		private WebElement loginbutton;
		
		//Initialization
		
		public Loginactitime(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		this.driver=driver;
			
		}
		
		//Utilization
		public void loginmethod()
		{
			
			usernametextfield.sendKeys("admin");
			passwordtextfield.sendKeys("manager");
			loginbutton.click();
			
		}
	

}
