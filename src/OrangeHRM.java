import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRM
{
    protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException
    {
       System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

       //open the browser
        driver = new ChromeDriver();
        //maximise the screen
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //go to the website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //enter username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //enter password
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        //driver will wait for 5 sec and move to next step
        Thread.sleep(2000); //it will wait for 2 seconds and after that it will move to next line.
        //click on login
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000); //it will wait for 3 seconds and after that it will move to next line.
        //click on Welcome Admin
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(5000); //it will wait for 5 seconds and after that it will move to next line.
        //click on Logout
        driver.findElement(By.xpath("//*[contains(@href, 'index.php/auth')]")).click();     //contains() method has been used here to find the correct path for logout
    }
}