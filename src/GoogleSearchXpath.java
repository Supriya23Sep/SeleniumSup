import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearchXpath {

	public static String SearchData="Testing";

	public static void main(String[] args) throws InterruptedException  
	{
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(SearchData);
	if(SearchData=="Selenium") {
		System.out.println("Pass");
	} 
	else {
	System.out.println("Fail");
	}
	driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	Thread.sleep(5000);
	String vSearch=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
	System.out.println(vSearch);
	Thread.sleep(5000);
	driver.close();
	
	}

}
