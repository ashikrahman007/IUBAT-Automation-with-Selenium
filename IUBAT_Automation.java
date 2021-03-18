package automation;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class IUBAT_Automation {

	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.Firefox.driver", "C://geckoDriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://cse.iubat.edu/");
	    
	    Thread.sleep(3000);
	    
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,350)");
	    
	    Thread.sleep(500);
	    
	    
	    jse.executeScript("window.scrollBy(350,700)");
	    
	    Thread.sleep(500);
	    
       jse.executeScript("window.scrollBy(700,1050)");
	    
	    Thread.sleep(500);
	    
        jse.executeScript("window.scrollBy(1050,1400)");
	    
	    Thread.sleep(500);
	    
       jse.executeScript("window.scrollBy(1400,1750)");
	    
	    Thread.sleep(500);	  
	    
        jse.executeScript("window.scrollBy(1750,2100)");
	    
	    Thread.sleep(500);
	    
	    jse.executeScript("window.scrollBy(0,-350)");
	    
	    Thread.sleep(500);
	    
        jse.executeScript("window.scrollBy(-350,-700)");
	    
	    Thread.sleep(500);
	    
        jse.executeScript("window.scrollBy(-700,-900)");
	    
	    Thread.sleep(2000);  


       
	    driver.findElement(By.cssSelector(".vc_btn3-size-md")).click();
	    
	    
	   // News obj=new News();
	  //  obj.IUBAT_News();
	    
	    
	    
	    
	    
	   // driver.get("http://cse.iubat.edu/news/");
		

	}

}
