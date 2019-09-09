import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test
{
    protected static WebDriver driver;

    public static void main (String[]args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        //open the browser
        driver =  new ChromeDriver();
        //maximise the browser window screen
        driver.manage().window().fullscreen();
        //driver.manage().window().maximize();
        //set implicit wait fro driver object
        //will delete all the cookies
        //driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter firstname
        //WebElement username = driver.findElement(By.id("FirstName")); //you can input elements by this way as well
        //username.sendKeys("Venus");                                   //you can input elements by this way as well
        driver.findElement(By.id("FirstName")).sendKeys("Venus");
        //enter lastname
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Patel");
        //enter email
        driver.findElement(By.name("Email")).sendKeys("testtest123456789@test.com");
        //Thread.sleep(2000); //it will wait for 2 seconds and will give result.
        //enter the password
        driver.findElement(By.id("Password")).sendKeys("test123");
        //confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
        //click on register to register the account
        driver.findElement(By.name("register-button")).click();
        //close the browser
        Thread.sleep(5000); //it will wait for 5 seconds and after that it will move to next line.
        driver.close();
        //driver.quit();
    }
}