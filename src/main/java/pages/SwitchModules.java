package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchModules {
	
final WebDriver driver;
	
	public SwitchModules(WebDriver BETASDRIVER) {
		this.driver = BETASDRIVER;
		PageFactory.initElements(BETASDRIVER,this);
	}
	
	@FindBy(xpath="(//select[@id='usermenuGroup'])[1]")private WebElement module;
	 public WebElement getModule() {
		 return module;
	 }
	 
	 @FindBy(xpath="(\"//option[. = 'BetaLogistics']\")")private WebElement betalogistics;
	 public WebElement getBetalogistics() {
		 return betalogistics;
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
