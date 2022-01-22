package farecompare;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Date {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.farecompare.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement attValue = driver.findElement(By.xpath("//div[@class='DayPickerInput']/input[@id='depart-date']"));
        attValue.click();

        driver.findElement(By.xpath("//div[@class='DayPicker-Week']/div[@aria-label='Tue Feb 1, 2022']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='DayPickerInput'])[2]//input[@id='return-date']")).click();

    }
}
