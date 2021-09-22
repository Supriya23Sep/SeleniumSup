import org.openqa.selenium.WebDriver;

public class EdgeDriver {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\msedgedriver.exe");
			WebDriver driver= new org.openqa.selenium.edge.EdgeDriver();
			driver.get("https:\\www.google.com");
			String title=driver.getTitle();
			System.out.println("My title is "+ title);
			Thread.sleep(5000);
			driver.close();
		}

}
