import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void testGoogleSearch() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.in");

        String expectedTitle = "Google";

        String actualTitle = driver.getTitle();

        System.out.println("Before Assertion " + expectedTitle + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("After Assertion " + expectedTitle + actualTitle + " Title matched ");
    }
}

