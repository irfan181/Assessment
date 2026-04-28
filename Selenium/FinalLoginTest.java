package partb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://tutorialsninja.com/demo/");
     
         // open link
    	 driver.get("https://the-internet.herokuapp.com/login");
    	 
    	 // Maximize window
         driver.manage().window().maximize();
         
         // Enter username
         driver.findElement(By.id("username")).sendKeys("tomsmith");

        // Enter password
         driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
         
         // Click login button
         driver.findElement(By.cssSelector("button[type='submit']")).click();

         

         // Get success message
         String message = driver.findElement(By.id("flash")).getText();
         
         // Validate login
         if(message.contains("You logged into a secure area!")) {
             System.out.println("✅ Login Successful");
         } else {
             System.out.println("❌ Login Failed");
             
             

             // Close browser
             driver.quit();
             
                 
         }

     } 
    	  	 
    	 
     }
     
     
	




