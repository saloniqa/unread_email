package newtask.unreademail;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	emailmain app = new emailmain();

	@Test(priority = 0)
	public void logintest() {
		String un = "salonitandon";
		String pw = "Saloni@321#";
		app.login(un, pw);
	}

	@Test(priority = 1)
	public void checkLoginSuccessfull() {
		Assert.assertTrue(app.loginValid());
	}

	@BeforeClass
	public void launchBrowser() {
		app.initiatedriver();

	}

	@AfterClass
	public void closeBrowser() {
		// driver.quit();

	}
}