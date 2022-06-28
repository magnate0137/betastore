import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.Pick;
import pages.SwitchModules;
import pages.Dispatch;
import pages.LogReco;
import pages.FinReco;

public class Launcher {
	WebDriver driver=null;

	@BeforeClass
	public void browserprops() {
		//Creating an object of ChromeDriver
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.core.simplemarket.app/login");
		//Deleting all the cookies
		//driver.manage().deleteAllCookies();
		//Specifying pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(240, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(230, TimeUnit.SECONDS);
		
	}
	@Test(priority = 1)
	public void validLogin() {
				
		LoginPage usernameField =new LoginPage(driver);
		usernameField.getUsernameField().sendKeys("temitope.ayokunle@betastore.co");

		LoginPage passwordField =new LoginPage(driver);
		passwordField.getPasswordField().sendKeys("temitope.ayokunle@betastore.co");
		
		LoginPage signinBtn = new LoginPage(driver);
		signinBtn.getSigninBtn().click();
		
	}
	

//	@Test(priority = 2)
//	public void SwitchModules() {
//				
//		SwitchModules module =new SwitchModules(driver);
//		module.getModule().click();
//		
//			
//		
//	}
//	
//	Select select = new Select(driver.findElement(By.id("")));
//
//	select. selectByValue();
//	
//	select = Select(driver.find_elementbyid("(//select[@id='usermenuGroup'])[1]"));
//			select.select_by_index(3)
//}

	@Test(priority =2 )
	public void pickModule() throws InterruptedException {
				
		Pick pickM =new Pick(driver);
		pickM.getPickM().click();
	
    	Pick pickMdl =new Pick(driver);
    	pickMdl.getPickMdl().click();
		
		//Pick Open
		Pick pickOpen =new Pick(driver);
    	pickOpen.getPickOpen().click();
		
		Thread.sleep(12000);
		
		Pick pickOpen1 =new Pick(driver);
		pickOpen1.getPickOpen1().click();
		
		Pick pickOpen2 =new Pick(driver);
		pickOpen2.getPickOpen2().click();
		
		Pick prtOpen =new Pick(driver);
		prtOpen.getPrtOpen().click();
	
		Pick processBtn =new Pick(driver);
		processBtn.getProcessBtn().click();
	
		//pick ongoing
		Thread.sleep(12000);

		Pick pickOn =new Pick(driver);
		pickOn.getPickOn().click();
		
		Thread.sleep(18000);
		
		Pick pickOn1 =new Pick(driver);
		pickOn1.getPickOn1().click();
	
		Pick pickOn2 =new Pick(driver);
		pickOn2.getPickOn2().click();
		
		Pick prtOn1 =new Pick(driver);
		prtOn1.getPrtOn1().click();
		
		Pick procesBtn1 =new Pick(driver);
		procesBtn1.getProcesBtn1().click();
		Thread.sleep(68000);
		
	}
//	
	@Test(priority =3 )
	public void Dispatch() throws InterruptedException {
		Thread.sleep(16000);	
		Dispatch dispaM =new Dispatch(driver);
		dispaM.getDispaM().click();
		
		Dispatch dispO =new Dispatch(driver);
		dispO.getDispO().click();
		
		Dispatch dispO1 =new Dispatch(driver);
		dispO1.getDispO1().click();
		
		Dispatch dispO2 =new Dispatch(driver);
		dispO2.getDispO2().click();
		
		Dispatch dispS =new Dispatch(driver);
		dispS.getDispS().click();
		
		Dispatch dispSb =new Dispatch(driver);
		dispSb.getDispSb().click();
		
		//Dispatch Ready For Loading
		Thread.sleep(12000);
		Dispatch dispR =new Dispatch(driver);
		dispR.getDispR().click();
		
		Dispatch dispR1 =new Dispatch(driver);
		dispR1.getDispR1().click();
		
		Dispatch dispR2 =new Dispatch(driver);
		dispR2.getDispR2().click();
		
		Dispatch dispRa =new Dispatch(driver);
		dispRa.getDispRa().click();
		
		WebElement da = driver.findElement(By.xpath("//form[@id='AssignMultiple']//select[@id='DeliveryAssociate']"));
		Select selectDa = new Select(da);
		selectDa.selectByVisibleText("COMFORT KOLAWOLE");
		
		WebElement dr = driver.findElement(By.xpath("//form[@id='AssignMultiple']//select[@id='Driver']"));
		Select selectDr = new Select(dr);
		selectDr.selectByVisibleText("Michael Isiuwa");
		
		Dispatch dispBlk =new Dispatch(driver);
		dispBlk.getDispBlk().click();
		
	}
	
	//Log Reconciliation

	@Test(priority =4 )
	public void LogReco() throws InterruptedException {
		Thread.sleep(12000);	
		LogReco logRn =new LogReco(driver);
		logRn.getLogRn().click();
		
		LogReco logR =new LogReco(driver);
		logR.getLogR().click();
		LogReco logRop =new LogReco(driver);
		logRop.getLogRop().click();
		Thread.sleep(12000);

		
		LogReco logRstc =new LogReco(driver);
		logRstc.getLogRstc().click();
		
		LogReco logRon =new LogReco(driver);
		logRon.getLogRon().click();
		Thread.sleep(1200);
		
		LogReco logRdet =new LogReco(driver);
		logRdet.getLogRdet().click();
		Thread.sleep(700);
				
		LogReco grpD =new LogReco(driver);
		grpD.getGrpD().click();
		
		LogReco fulD =new LogReco(driver);
		fulD.getFulD().click();
		
		LogReco fullD =new LogReco(driver);
		fullD.getFullD().click();
		
				
	}
	
		//Fin Reconciliation

		@Test(priority =5 )
		public void FinReco() throws InterruptedException {
			Thread.sleep(12000);	
			FinReco finRn =new FinReco(driver);
			finRn.getFinRn().click();
			
			FinReco finRn1 =new FinReco(driver);
			finRn1.getFinRn1().click();
			
			FinReco finRnop =new FinReco(driver);
			finRnop.getFinRnop().click();
			Thread.sleep(12000);
			
			FinReco finRnst =new FinReco(driver);
			finRnst.getFinRnst().click();
			
			FinReco finRnstf =new FinReco(driver);
			finRnstf.getFinRnstf().click();
			
			//Finreco Ongoing
			
			FinReco finRnon =new FinReco(driver);
			finRnon.getFinRnon().click();
			Thread.sleep(12000);
			
			FinReco finRndt =new FinReco(driver);
			finRndt.getFinRndt().click();
			
			FinReco finRndtg =new FinReco(driver);
			finRndtg.getFinRndtg().click();
			
			WebElement st = driver.findElement(By.xpath("//select[@id='FinReco_DeliveryStatusId']"));
			Select selectSt = new Select(st);
			selectSt.selectByVisibleText("FullyDelivered");
			
//			WebElement rf = driver.findElement(By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-border-down']//div[@role='listbox']"));
//			Select selectRf = new Select(rf);
//			selectRf.selectByValue("1");
			
			WebElement pt = driver.findElement(By.xpath("//select[@id='FinReco_PaymentTypeId']"));
			Select selectPt = new Select(pt);
			selectPt.selectByVisibleText("Full");
			
			WebElement pm = driver.findElement(By.xpath("//select[@id='FinPayment_PaymentMethodId']"));
			Select selectPm = new Select(pm);
			selectPm.selectByVisibleText("Cash");
}
		
		
		
	
}

