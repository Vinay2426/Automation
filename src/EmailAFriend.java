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

        //click on macbook pro
        driver.findElement(By.xpath("//*[@alt = 'Picture of Apple MacBook Pro 13-inch' and @title='Show details for Apple MacBook Pro 13-inch']")).click();
        //click on email a friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //fill friend's email address
        driver.findElement(By.id("FriendEmail")).sendKeys("testtest123456@test.com");
        //fill your email address
        driver.findElement(By.id("YourEmailAddress")).sendKeys("vinaybkahir@gmail.com");
        //fill personal message
        driver.findElement(By.name("PersonalMessage")).sendKeys("This very good deal mate, don't need to miss it. go ahead and buy it");
        //click on send email
        driver.findElement(By.name("send-email")).click();
    }

}
