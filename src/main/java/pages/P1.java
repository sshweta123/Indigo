package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1 {
	@FindBy(xpath="//*[@id='main']//*[@class='menu-top-container']//child::ul//li[1]")
	private WebElement Demosbutton;
	
	@FindBy(xpath="//*[@id='main']//*[@class='menu-top-container']//child::ul//li//a[text()='About']")
	private WebElement Aboutbutton;
	
		
	//constructor
	
	public P1(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	}
	
	//action
	
	public void dmsbtn() throws InterruptedException {
		Thread.sleep(2000);
		Demosbutton.click();		
		
	}
	
	
	public void abtbtn() {
		
		Aboutbutton.click();
		
	}
	

}
