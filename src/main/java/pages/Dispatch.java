package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dispatch {

	final WebDriver driver;
	
	public Dispatch(WebDriver BETASDRIVER) {
		this.driver = BETASDRIVER;
		PageFactory.initElements(BETASDRIVER,this);
	}
	
	 @FindBy(xpath="//span[normalize-space()='Dispatch']")private WebElement dispaM;
	 public WebElement getDispaM() {
		 return dispaM;
	 }
	 
	 @FindBy(xpath="//span[normalize-space()='Dispatch Open']")private WebElement dispO;
	 public WebElement getDispO() {
		 return dispO;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")private WebElement dispO1;
	 public WebElement getDispO1() {
		 return dispO1;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")private WebElement dispO2;
	 public WebElement getDispO2() {
		 return dispO2;
	 }
	 
	 @FindBy(xpath="//button[@id='startbtn']//i[@class='fa fa-play']")private WebElement dispS;
	 public WebElement getDispS() {
		 return dispS;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/button[1]")private WebElement dispSb;
	 public WebElement getDispSb() {
		 return dispSb;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]")private WebElement dispR;
	 public WebElement getDispR() {
		 return dispR;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")private WebElement dispR1;
	 public WebElement getDispR1() {
		 return dispR1;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")private WebElement dispR2;
	 public WebElement getDispR2() {
		 return dispR2;
	 }

	 @FindBy(id="bulkassignbtn")private WebElement dispRa;
	 public WebElement getDispRa() {
		 return dispRa;
	 }
	 
	 @FindBy(xpath="//form[@id='AssignMultiple']//button[@id='btnBulkStartProcess']")private WebElement dispBlk;
	 public WebElement getDispBlk() {
		 return dispBlk;
	 }
	 
	 
	 
}