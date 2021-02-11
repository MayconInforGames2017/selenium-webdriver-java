package teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadores {

	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.get("http://www.youtube.com.br");
	}

	@Test
	public void test() {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close();
		driver.quit();
	}

}
