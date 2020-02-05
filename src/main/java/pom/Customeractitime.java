package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customeractitime 
{
	public WebDriver driver;
	//Declaration
	
	@FindBy(id="container_tasks")
	private WebElement taskbutton;
	
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addnewbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerlink;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement entercustomername;
	
	@FindBy(xpath="//div[@class='components_button  withPlusIcon']")
	private WebElement createcustomerbutton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbutton;

	
	
	//intisilation
	
	public Customeractitime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//utilisation
	public void customermethod() throws InterruptedException 
	{
		Thread.sleep(10000);
		taskbutton.click();
		Thread.sleep(5000);
		addnewbutton.click();
		Thread.sleep(4000);
		newcustomerlink.click();
		entercustomername.sendKeys("sonu");
		//createcustomerbutton.click();
	}
	public void cancel()
	{
		cancelbutton.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}


}
