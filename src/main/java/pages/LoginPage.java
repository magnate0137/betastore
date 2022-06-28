package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	final WebDriver driver;
	
	public LoginPage(WebDriver BETASDRIVER) {
		this.driver = BETASDRIVER;
		PageFactory.initElements(BETASDRIVER,this);
	}
	
	 @FindBy(xpath="//input[@id='Username']")private WebElement usernameField;
	 public WebElement getUsernameField() {
		 return usernameField;
	 }
	
	 @FindBy(xpath="(//input[@id='Password'])[1]")private WebElement passwordField;
	 public WebElement getPasswordField() {
		 return passwordField;
	 }
	
	 @FindBy(xpath="//button[@type='submit']")private WebElement signinBtn;
	 public WebElement getSigninBtn() {
		 return signinBtn;
	 }
	
	
	
	
	
	
	
	
}
