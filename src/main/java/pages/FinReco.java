package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinReco {

	final WebDriver driver;
	
	public FinReco(WebDriver BETASDRIVER) {
		this.driver = BETASDRIVER;
		PageFactory.initElements(BETASDRIVER,this);
	}
	
	 @FindBy(xpath="(//span[normalize-space()='Finance Reconcilliation'])[1]")private WebElement finRn;
	 public WebElement getFinRn() {
		 return finRn;
	 }
	 
	 @FindBy(xpath="//span[normalize-space()='Reconcilliation Queue']")private WebElement finRn1;
	 public WebElement getFinRn1() {
		 return finRn1;
	 }
	 
	 @FindBy(xpath="//button[@id='btnFinRecoListOpen']")private WebElement finRnop;
	 public WebElement getFinRnop() {
		 return finRnop;
	 }
	 
	 @FindBy(xpath="//button[@name='startfinreco']")private WebElement finRnst;
	 public WebElement getFinRnst() {
		 return finRnst;
	 }

	 
	 @FindBy(xpath="//button[@id='btnStartTheFinReco']")private WebElement finRnstf;
	 public WebElement getFinRnstf() {
		 return finRnstf;
	 }

	 
	 @FindBy(xpath="//button[@id='btnFinRecoListOngoing']")private WebElement finRnon;
	 public WebElement getFinRnon() {
		 return finRnon;
	 }
	 
	 @FindBy(xpath="//tbody/tr[1]/td[8]/a[1]")private WebElement finRndt;
	 public WebElement getFinRndt() {
		 return finRndt;
	 }
	 
	 @FindBy(xpath="//a[normalize-space()='Group Reco']")private WebElement finRndtg;
	 public WebElement getFinRndtg() {
		 return finRndtg;
	 }
	 
	 @FindBy(xpath="//a[normalize-space()='Group Reco']")private WebElement finRndto;
	 public WebElement getFinRndto() {
		 return finRndto;
	 }
	 
	 @FindBy(xpath="//a[normalize-space()='Group Reco']")private WebElement finRndrf;
	 public WebElement getFinRndrf() {
		 return finRndrf;
	 }
	 
	 
}