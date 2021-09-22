import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonYourAcc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions accounts = new Actions(driver);
		accounts.moveToElement(driver.findElement(By.linkText("Account & Lists"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Your Account")).click();
		driver.close();
	}

}
