import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Prompt1");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(7000);
		
		System.out.println(driver.findElement(By.id("prompt-demo")).getText());
		
		driver.close();
	}

}
