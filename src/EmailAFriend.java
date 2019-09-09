import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailAFriend
{
    protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        //open the browser
        driver =  new ChromeDriver();
        //maximise the browser window
        driver.manage().window().maximize();
        //set implicit wait for driver object
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //Click on Register Button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter the first name
        driver.findElement(By.id("FirstName")).sendKeys("Vinay");
        //enter the last name
        driver.findElement(By.name("LastName")).sendKeys("Ahir");
        //enter the email
        driver.findElement(By.id("Email")).sendKeys("vinus-2@gmail.com");
        //enter password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vinus123");
        //confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Vinus123");
        //click register
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
        //click continue
        driver.findElement(By.xpath("//input[@name='register-continue']")).click();
        //continue click will lead to homepage
        //click on macbook pro
        driver.findElement(By.xpath("//*[@alt = 'Picture of Apple MacBook Pro 13-inch' and @title='Show details for Apple MacBook Pro 13-inch']")).click();
        //click on email a friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //fill friend's email address
        driver.findElement(By.id("FriendEmail")).sendKeys("testtest123456@test.com");
        //fill personal message
        driver.findElement(By.name("PersonalMessage")).sendKeys("This very good deal mate, don't need to miss it. go ahead and buy it");
        //click on send email
        driver.findElement(By.name("send-email")).click();
        //close the page
        Thread.sleep(5000); //it will wait for 5 seconds and after that it will move to next step

        driver.close();
    }
}