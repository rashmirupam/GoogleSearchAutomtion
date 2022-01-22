package farecompare;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FareCampareTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.farecompare.com/");
        Thread.sleep(1000);
        WebElement labelCheckbox = driver.findElement(By.xpath("//label[text()='Alert me when prices change']"));
        System.out.println(labelCheckbox.isDisplayed());
        Thread.sleep(1000);
        WebElement depart = driver.findElement(By.xpath("//span[@class='SuggestField__inputWrapper__fc']/input[@id='depart']"));
        System.out.println(depart.isDisplayed());

        depart.sendKeys("Patna, IN");
        depart.click();
        Thread.sleep(2000);
        WebElement dest = driver.findElement(By.xpath("//span[@class='SuggestField__inputWrapper__fc']/input[@id='dest']"));
        dest.clear();
        dest.sendKeys("Patna, IN");
        dest.click();
        Thread.sleep(1000);

        Thread.sleep(2000);
        WebElement alertCheckbox = driver.findElement(By.xpath("//label[@class='alert-label']/input[@type='checkbox']"));
        System.out.println(alertCheckbox.isSelected());
        alertCheckbox.click();
        System.out.println(alertCheckbox.isSelected());

        driver.findElement(By.xpath("//div[@class='DayPicker-Week']/div[@aria-label='Tue Feb 1, 2022']")).click();
        Thread.sleep(1000);
    }
}


