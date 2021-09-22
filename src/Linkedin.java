import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.linkedin.com");	
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("session_key")).sendKeys("admin");
		driver.findElement(By.id("session_password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/button")).click();;
		Thread.sleep(5000);
		String msg= driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/div[1]/div/p")).getText();
		System.out.println("Error is " +msg);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("reset-password-submit-button"));
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.close();
		
	}

}
