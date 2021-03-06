
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lethabo
 */
public class API {

public void testPushNotifications() throws Exception {
  DesiredCapabilities capabilities = new DesiredCapabilities();
  capabilities.setCapability("platformName", "iOS");
  capabilities.setCapability("platformVersion", "11.2");
  capabilities.setCapability("deviceName", "iPhone 6s");
  capabilities.setCapability("app", APP);
  capabilities.setCapability("udid", "auto");
  capabilities.setCapability("xcodeOrgId", XCODE_ORG_ID);
  capabilities.setCapability("xcodeSigningId", "iPhone Developer");
  capabilities.setCapability("updatedWDABundleId", WDA_BUNDLE_ID);
  driver = new IOSDriver(new URL("http://www.way2automation.com/angularjs-protractor/webtables/""), capabilities);
    
    
     driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
    
    //Thread.sleep(20000);
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='FirstName']")));
    driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName1");
    System.out.print("FirstName is Entered and textbox is visible");
    



    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='LastName']")));
    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName1");
    
    
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='UserName']")));
    driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User1");
    
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Password']")));
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass1");
    
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='15']")));
    driver.findElement(By.xpath("//input[@value='15']")).click();
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='RoleId']")));
    driver.findElement(By.xpath("//select[@name='RoleId']")).sendKeys("Admin");
     
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Email']")));
    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@mail.com");
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Mobilephone']")));
    driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("0821234555");
    
    Thread.sleep(10000);

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
    driver.findElement(By.cssSelector(".btn.btn-success")).click();
    
    
     
    driver.quit();
    }
}

    

