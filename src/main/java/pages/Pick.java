package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pick {

	final WebDriver driver;
	
	public Pick(WebDriver BETASDRIVER) {
		this.driver = BETASDRIVER;
		PageFactory.initElements(BETASDRIVER,this);
	}
	
	 @FindBy(xpath="//body/div[@class='wrapper']/div[@class='main-sidebar']/div[@class='sidebar']/ul[@class='sidebar-menu tree']/li[1]/a[1]")private WebElement pickM;
	 public WebElement getPickM() {
		 return pickM;
	 }
	
	 @FindBy(xpath="//span[@class='menu-item-title'][normalize-space()='Pick Module']")private WebElement pickMdl;
	 public WebElement getPickMdl() {
		 return pickMdl;
	 }
	 
	 
	 @FindBy(xpath="//button[@id='btnOpen']")private WebElement pickOpen;
	 public WebElement getPickOpen() {
		 return pickOpen;
	 }
	 
	 //Move orders to ongoing
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")private WebElement pickOpen1;
	 public WebElement getPickOpen1() {
		 return pickOpen1;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")private WebElement pickOpen2;
	 public WebElement getPickOpen2() {
		 return pickOpen2;
	 }
	 
	 
	 @FindBy(xpath="//button[@id='printbtn']")private WebElement prtOpen;
	 public WebElement getPrtOpen() {
		 return prtOpen;
	 }
	 
	 
	 @FindBy(xpath="//button[@id='btnReProcessP']")private WebElement processBtn;
	 public WebElement getProcessBtn() {
		 return processBtn;
	 }
	 
	 @FindBy(xpath="//button[@id='btnOngoing']")private WebElement pickOn;
	 public WebElement getPickOn() {
		 return pickOn;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")private WebElement pickOn1;
	 public WebElement getPickOn1() {
		 return pickOn1;
	 }
	 
	 @FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")private WebElement pickOn2;
	 public WebElement getPickOn2() {
		 return pickOn2;
	 }
	 
	 @FindBy(xpath="//button[@id='printbtn']")private WebElement prtOn1;
	 public WebElement getPrtOn1() {
		 return prtOn1;
	 }
	 
	 
	 @FindBy(xpath="//button[@id='btnReProcessP']")private WebElement procesBtn1;
	 public WebElement getProcesBtn1() {
		 return procesBtn1;
	 }
	 
	 
}