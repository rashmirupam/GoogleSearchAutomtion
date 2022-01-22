package farecompare;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.farecompare.com/");
        Thread.sleep(1000);
        WebElement alertCheckbox = driver.findElement(By.xpath("//label[@class='alert-label']/input[@type='checkbox']"));
        System.out.println(alertCheckbox.isSelected());
        alertCheckbox.click();
        System.out.println(alertCheckbox.isSelected());
    }
}
