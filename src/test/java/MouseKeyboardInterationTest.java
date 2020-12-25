import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardInterationTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		   System.setProperty("webdriver.chrome.driver","D:\\CDAC DATA\\ASDMLAB\\chromedriver_win32\\chromedriver.exe");	   
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   driver.manage().window().maximize();
		   	   
		   
		   //now login to website from java code
		   
		   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		   
		   driver.findElement(By.name("Submit")).click();
		   
		  
		   Thread.sleep(1000);
		   
		   WebElement admin=driver.findElement(By.linkText(("Admin")));
		   Actions act=new Actions(driver);
		   act.click(admin).build().perform();
		   
		   
		   //selecting label
		   
		   WebElement ename=driver.findElement(By.xpath("//*[@id=\"search_form\"]/fieldset/ol/li[3]/label"));
		  driver.findElement(By.tagName("body")).click();
		  act.doubleClick(ename).build().perform();
		   
		   
		   
		 //*[@id="search_form"]/fieldset/ol/li[3]/label
		   
		
	}

	  

}
