import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.monosnap.com/");
        Thread.sleep(7000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.className("btnAccept")).click();
        driver.findElement(By.className("headButton")).click();
        driver.findElement(By.xpath("//input[@class='w-100 textInput in']")).sendKeys("adewuyi.adekunle@gmail.com");
        driver.findElement(By.xpath("//input[@class='w-100 textInput']")).sendKeys("arikemi123");
        driver.findElement(By.xpath("//button[@class='login']")).click();
    }

    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();


    }






}
