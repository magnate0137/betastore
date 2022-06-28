package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogReco {

	final WebDriver driver;
	
	public LogReco(WebDriver BETASDRIVER) {
		this.driver = BETASDRIVER;
		PageFactory.initElements(BETASDRIVER,this);
	}
	
	 @FindBy(xpath="//span[normalize-space()='Log Reconcilliation']")private WebElement logRn;
	 public WebElement getLogRn() {
		 return logRn;
	 }
	 
	 @FindBy(xpath="//span[normalize-space()='Log Reco']")private WebElement logR;
	 public WebElement getLogR() {
		 return logR;
	 }
	 @FindBy(xpath="//button[@id='btnLogRecoOpen']")private WebElement logRop;
	 public WebElement getLogRop() {
		 return logRop;
	 }
	 
	 @FindBy(xpath="//tr[@class='odd']//button[@name='startlogreco'][normalize-space()='Start Reco']")private WebElement logRst;
	 public WebElement getLogRst() {
		 return logRst;
	 }
	 
	 @FindBy(xpath="//button[@id='btnStartTheLogReco']")private WebElement logRstc;
	 public WebElement getLogRstc() {
		 return logRstc;
	 }
	 
	 @FindBy(xpath="//button[@id='btnLogRecoOngoing']")private WebElement logRon;
	 public WebElement getLogRon() {
		 return logRon;
	 }
	
	 @FindBy(xpath="//tbody/tr[2]/td[8]/a[1]")private WebElement logRdet;
	 public WebElement getLogRdet() {
		 return logRdet;
	 }
	 
	 @FindBy(xpath="//div[@class='dataTables_scrollHeadInner']//input[@id='groupCheck']")private WebElement grpD;
	 public WebElement getGrpD() {
		 return grpD;
	 }
	 
	 @FindBy(xpath="//button[@id='btnFullyDelivered']")private WebElement fulD;
	 public WebElement getFulD() {
		 return fulD;
	 }
	 
	
	 @FindBy(xpath="//button[@id='btnFullDelivery']")private WebElement fullD;
	 public WebElement getFullD() {
		 return fullD;
	 }
	 
}