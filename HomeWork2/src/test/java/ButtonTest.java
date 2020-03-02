import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonTest {

    WebDriver chromeDriver;

    @BeforeTest
    public void start() {
        System.setProperty("webdriver.chrome.driver", "E:\\EPAM\\Auto\\Drivers\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://formy-project.herokuapp.com/buttons/");
    }

    @Test(dataProvider = "DataProviderForButtonTest", dataProviderClass = DataProviderForButtonTest.class)
    public void verifyString(String name) {
        chromeDriver.findElement(By.xpath(name)).click();
    }

}



