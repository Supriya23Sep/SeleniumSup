import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoZFold {
	
	public static String SearchData="oneplus";
	
	public static void main(String[] args) throws InterruptedException  
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//option[@value='search-alias=aps']")).click();
			driver.findElement(By.xpath("//option[@value='search-alias=todays-deals']")).click();
			driver.findElement(By.id("searchDropdownBox")).click();
			//Select Category = new Select(driver.findElement(By.xpath("//option[@value='search-alias=aps']")));
			//Category.selectByValue("search-alias=todays-deals");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(SearchData);
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"p_n_availability/1318485031\"]/span/a/div/label/i")).click();
			Thread.sleep(2000);
			String result1 = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
			if (result1.contains("fold3")) {
				System.out.println("Search Result : Pass");
			}
			else {
				System.out.println("Search Result : Fail");
			}
			//driver.getTitle(By.xpath("//html/body/div[1]/div[2]/span[@data-component-type='data-component-type']"))
			Boolean result2 = driver.getTitle().contains("fold3");
			if (result2.equals(true)) {
				System.out.println("Title is : Pass");
			}
			else {
				System.out.println("Title is : Fail");
			}
			
			driver.close();
			System.out.println("End of the Test");
			
			
	}

}
