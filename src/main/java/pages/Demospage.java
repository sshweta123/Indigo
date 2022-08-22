package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demospage {
  
    @FindBy(xpath="//*[@id='content']//child::ul//li//a[text()='Draggable']")
    private WebElement Dragblelink;
    @FindBy(xpath="//*[@id='main']//child::ul//li//a[text()='Download']")
    private WebElement Downloadlink;
public Demospage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

    public void drop() throws InterruptedException {
    	Thread.sleep(2000);
    	Dragblelink.click();
    	Thread.sleep(2000);
    }
   
    
public void down() throws InterruptedException {
	Thread.sleep(2000);
	Downloadlink.click();
	Thread.sleep(2000);
}

    
}
