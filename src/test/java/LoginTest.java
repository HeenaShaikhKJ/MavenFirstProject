import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest 
{
	   public static void main(String[] args)throws InterruptedException
	   {
		
		   System.setProperty("webdriver.chrome.driver","D:\\CDAC DATA\\ASDMLAB\\chromedriver_win32\\chromedriver.exe");	   
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   driver.manage().window().maximize();
		   
		   
		   //now login to website from java code
		   
		   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		   
		   driver.findElement(By.name("Submit")).click();
		   
		   driver.findElement(By.id("welcome")).click();
		   //Thread.sleep(500);
		   //driver.findElement(By.linkText("Logout")).click();
		   
		   
		   //clicking link then list box value select
		   
		   
		   driver.findElement(By.linkText("Leave")).click();
		   Thread.sleep(1000);
		   Select subunit=new Select(driver.findElement(By.name("leaveList[cmbSubunit]")));
		   subunit.selectByIndex(3);
		   subunit.selectByValue("13");
		   Thread.sleep(1000);
		   subunit.selectByVisibleText("  TechOps");
		   
		 
		   
		 //*[@id="leaveList_chkSearchFilter_2"] copy xpath by clicking control then inspect then in inspect copy xpath
		    
		   driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_2\"]")).click();
		   
		   
		   
	   }
	
}
