package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplebrowsers {

	public WebDriver driver;

  @Parameters("browser")

  @BeforeClass
 
  public void beforeTest(String browser) 
  {

  
  if(browser.equalsIgnoreCase("microedge"))
  {
	  System.setProperty("webdriver.edge.driver", "D:\\drivers\\msedgedriver.exe");
	 
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();

  }
  else if (browser.equalsIgnoreCase("chrome")) 
  { 

	  System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	// WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();

  } 
  else if (browser.equalsIgnoreCase("Firefox")) 
  { 

	  System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
				  WebDriver driver = new FirefoxDriver(); 
	  driver.manage().window().maximize();

  } 

    driver.get("https://www.facebook.com/"); 

  }

  

  @Test public void login() throws InterruptedException {

	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();

	}  

  @AfterClass public void afterTest() {

		driver.quit();

	}

}


