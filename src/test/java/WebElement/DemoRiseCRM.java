package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoRiseCRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set thời gian tìm kiếm 1 element là 10 giây

        driver.get("https://rise.fairsketch.com/signin");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        driver.findElement(By.xpath("//button[@id='reload-kanban-button']")).click();


        boolean isDisplayed = driver.findElement(By.xpath("//button[@id='reload-kanban-button']")).isDisplayed();
        System.out.println("Check isDisplayed: "+ isDisplayed);

        boolean isEnabled = driver.findElement(By.xpath("//span[normalize-space()='Projects']")).isEnabled();
        System.out.println("Check isEnabled: "+ isEnabled);




    }
}
