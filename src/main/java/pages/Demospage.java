package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demospage {
  
    @FindBy(xpath="//*[@id='content']//child::ul//li[1]")
    private WebElement Dragblelink;
    
public Demospage (WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	}
    public void drop() {
    	Dragblelink.click();
    }
    
    
}
