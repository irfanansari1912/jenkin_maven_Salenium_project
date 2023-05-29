package Saleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleniumClass {

	public static void main(String[] args) throws InterruptedException{
		
	//  1.launch the browser
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		//2. launch the para bank app
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
		
		//3.verify the page title
		String expectedResult = "ParaBank | Welcome | Online Banking";
		String actualResult = driver.getTitle();
		
		if(expectedResult.equals(actualResult))
			{
			System.out.println("Test is passed");
			}
			else
			{
			System.out.println("Test is failed");
			}
			Thread.sleep(2000);
			
			//4. close the chrome browser
			//driver.close();
			driver.quit();
			
			
	}

}
