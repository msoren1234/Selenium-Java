package il.co.wixmeup;

import org.testng.annotations.Test;

import il.co.base.TestUtilities;
import il.co.pages.WixFormPage;



/////////// Basic Test ////////////

// Include:
// Page object model
// Logger log4j2

// Exclude:
// External parameter data from CSV


public class CheckFormTestAdvance extends TestUtilities {


	@Test
	public void BasicTest() {
		
		log.info("Starting TestActions");
		
		WixFormPage wixFormPage = new WixFormPage(driver, log);

		// open main page
		wixFormPage.openPage();
		
		log.info("Check MINUS action");
		
		//Check MINUS action
		wixFormPage.typeNumber1("7")
					.typeNumber2("3")
					.dropDownAction("MINUS")
					.pushCalcButton();


		Sleep(1000);
		// Verifications
		wixFormPage.waitForRestuls()
					.VerifyTextElement("4", wixFormPage.restuls());
	
		
	}
	
	

}
