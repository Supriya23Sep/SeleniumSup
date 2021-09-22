import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouCanDealWith {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.youcandealwithit.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions borrowers = new Actions(driver);
		borrowers.moveToElement(driver.findElement(By.linkText("BORROWERS"))).build().perform();
		driver.findElement(By.linkText("Calculators & Resources")).click();
		driver.findElement(By.linkText("Calculators")).click();
		driver.findElement(By.linkText("Budget Calculator")).click();
		driver.findElement(By.id("food")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.id("clothing")).sendKeys("8000");
		Thread.sleep(2000);
		driver.findElement(By.id("shelter")).sendKeys("20000");
		Thread.sleep(2000);
		driver.findElement(By.id("monthlyPay")).sendKeys("15000");
		Thread.sleep(2000);
		driver.findElement(By.id("monthlyOther")).sendKeys("5000");
		Thread.sleep(2000);
		String totMonExp = driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println("Total Monthly Expense: " +totMonExp);
		String totMonInc = driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println("Total Monthly Income: " +totMonInc);
		Float tme = Float.valueOf(totMonExp);
		Float tmi = Float.valueOf(totMonInc);
		if (tmi > tme) {
			System.out.println("Income is Greater");
		} else {
			System.out.println("Expense is Greater");
		}
		driver.close();
		System.out.println("Test Ended");
	}

}
