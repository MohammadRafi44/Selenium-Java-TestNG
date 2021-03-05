package webPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
    private WebDriver driver;
  
//hi
    //hi 2244
    @BeforeClass
    public static void setupClass() {
    	WebDriverManager.chromedriver().setup();
	}
    
    @BeforeMethod
    public void setupTest() {
    	driver = new ChromeDriver();

    	
    }

    @AfterMethod
    public void tearDown() {
    	if(driver !=null) {
    		driver.quit();
    	}
   	
    }
    
    @Test
    public void test1() throws InterruptedException {
    	driver.get("https://www.google.com");
    	driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Software Testing");
    	driver.manage().window().maximize();
    	Thread.sleep(2000);

    	
    }
}
