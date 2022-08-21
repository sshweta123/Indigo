package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demospage {
  
    @FindBy(xpath="//*[@id='content']//child::ul//li[1]")
    private WebElement Dragblelink;
    
    public void drop() {
    	Dragblelink.click();
    }
    
    
}
