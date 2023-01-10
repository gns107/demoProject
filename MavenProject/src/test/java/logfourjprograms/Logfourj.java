package logfourjprograms;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Logfourj {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Logger logger=Logger.getLogger("Logfourj");
		PropertyConfigurator.configure("logproperties");
		 
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
		logger.info("Browser is Opened");
		
		driver.get("https://www.facebook.com/");
		
		logger.info("application launched");
		
		driver.findElement(By.id("email")).sendKeys("gnsanilkumar@gmail.com");
		logger.info("email entered");
		
		driver.findElement(By.id("pass")).sendKeys("GNSAnilkumar@1");
		logger.info("password entered");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\MY PC\\eclipse-workspace\\MavenProject\\Screenshots\\fbLogin.png"));
		logger.info("screenshot Sucessful");
		
		
	}

}