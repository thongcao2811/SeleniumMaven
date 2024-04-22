package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoMethod_isSelected {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set thời gian tìm kiếm 1 element là 10 giây

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        Thread.sleep(1000);


        boolean checkbox1 = driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']/input")).isSelected();
        System.out.println("Checkbox 1: " + checkbox1);

        String text1 = driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']")).getText();
        System.out.println("Text 1: "+ text1);

        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        boolean checkbox1After =  driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']/input")).isSelected();
        System.out.println("Checkbox1 after: " + checkbox1After);


        boolean checkbox2 = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected();
        System.out.println("Checkbox 2: " + checkbox2);


       driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).click();
       boolean checkbox2After = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected();
       System.out.println("Checkbox 2 after: " + checkbox2After);


       boolean checkbox3 = driver.findElement(By.xpath("//label[normalize-space()='Default Disabled']/input")).isSelected();
        System.out.println("Checkbox 3: " + checkbox3);



//        driver.quit();

    }
}
