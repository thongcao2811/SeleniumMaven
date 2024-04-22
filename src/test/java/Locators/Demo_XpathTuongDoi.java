package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_XpathTuongDoi {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);
//      driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        Thread.sleep(1000);

//        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

        Thread.sleep(1000);

//        driver.findElement(By.linkText("Forgot Password?")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();

        Thread.sleep(1000);
//
//        driver.findElement(By.className("form-control")).sendKeys("admin@example.com");
//        driver.findElement(By.className("btn")).click();

//        driver.findElement(By.tagName("button")).click();
//        driver.findElement(By.id("remember")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
//        driver.findElement(By.className("btn")).click();
//        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();



//        driver.quit();

    }
}
