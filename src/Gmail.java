import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://gmail.com/");
		driver.manage().window().maximize();
		
		
		//Window Handling
		
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		//explicit wait
		WebDriverWait ewait = new WebDriverWait(driver,20);
		ewait.until(ExpectedConditions.elementToBeClickable(By.linkText("Help")));
				
		driver.findElement(By.linkText("Help")).click();
		
		//driver.switchTo().window("Window ID");
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String> it = ids.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		
		System.out.println(ParentID);
		System.out.println(ChildID);
		
		driver.switchTo().window(ChildID);
		
		
		String help = driver.getTitle();
		System.out.println("Help title is: "+help);
		driver.quit();

	}

}
