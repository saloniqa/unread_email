package newtask.unreademail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class emailmain {
	WebDriver driver;
	public void login(String username,String psswrd)
	{ driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(psswrd);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("ztih__main_Mail__FOLDER_textCell")));
		String s=driver.findElement(By.id("ztih__main_Mail__FOLDER_textCell")).getText();
		
	   Assert.assertEquals(s,"Mail Folders");
	   String s1=driver.findElement(By.xpath("//*[@id=\"zti__main_Mail__2_textCell\"]")).getText();
	  // System.out.print(s1);
	 String  s2=s1.substring(5);
	 System.out.print("unread emails"+s2);
	//String s=driver.findElement(By.xpath("//*[@id=\"zti__main_Mail__2_textCell\"]/span")).getText();
	 
	}

	public void initiatedriver() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\salonitandon\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webmail.qainfotech.com/");
	}

		public boolean loginValid() {
       Boolean condition = false;
         WebDriverWait wait = new WebDriverWait(driver,10);
         wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"z_userName\"]")));
		 String userName = driver.findElement(By.xpath("//*[@id=\"z_userName\"]")).getText();
		 String expectedName = "Saloni Tandon";
		 //System.out.println(userName);
		 if(userName.equals(expectedName))
		 {
			 condition = true;
		 }	
		
		return condition;
	}
	
}

