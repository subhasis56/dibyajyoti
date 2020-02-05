package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Workactitime
{
	public WebDriver driver;
	//Declaration
	
	@FindBy(xpath="//div[@class='menu_icon']")
	private WebElement settingicon;
	
	@FindBy(xpath="//a[.='Types of Work']") 
	private WebElement typesofworkbutton;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeworkbutton;
	
	@FindBy(id="name")
	private WebElement enterworkname;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusbutton;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement creatework;
	
	//intilization
	
	public Workactitime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	//utilisation
	
	public void workmethod() throws InterruptedException
	{
		Thread.sleep(10000);
		settingicon.click();
		Thread.sleep(5000);
		typesofworkbutton.click();
		Thread.sleep(5000);
		createtypeworkbutton.click();
		Thread.sleep(4000);
		enterworkname.sendKeys("dibya");
	}
		public void status()
		{
			WebElement sele = driver.findElement(By.xpath("//select[@name='active']"));
		Select ne=new Select(sele);
		ne.selectByIndex(1);
		}
		public void creatework()
		{
		//statusbutton.click();
		creatework.click();
		}
	
	

}
