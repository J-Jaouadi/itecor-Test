package Selenium.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	// Create a new instance of the Firefox driver
	private WebDriver driver;
			
			
  @Test
  public void f() throws InterruptedException {
	 
       
			//Wait for 5 Sec
			Thread.sleep(5000);
			
			// Get all links of Webpage
			List<WebElement> list=driver.findElements(By.xpath("//*[@href]"));
		    System.out.println("No of links present="+ list.size());
	
		    System.out.println("----------Test---------------");
		    driver.findElement(By.xpath("//*[@id='menu-item-2285']/a")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/section/article/div[2]/div[2]/div/div/a[1]")).click();
		         
		    // fetch the title of the web page and print it
		    System.out.println(driver.getTitle());
		    
		    //use of for each for iteration
		    for(WebElement wb: list)
		    	if (wb.getAttribute("href") !=null && !wb.getAttribute("href").isEmpty()){
		    		System.out.println(wb.getAttribute("href") +"  "+wb.getText());
		    }
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  		System.out.println( "Hello World!" );
      
	  		// Create a new instance of the Firefox driver
			driver = new FirefoxDriver();
			
			//Launch the Online Store Website
			driver.get("https://itecor.com");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the website itecor.com");
  }

  @AfterTest
  public void afterTest() {
	  // Close the driver
      driver.quit();
      System.out.println("Test script executed successfully.");
      // terminate the program
      System.exit(0);
  }

}
