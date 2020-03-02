import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBoxes {

    WebDriver chromeDriver;

    @BeforeTest
    public void startXpath() {
        System.setProperty("webdriver.chrome.driver", "E:\\EPAM\\Auto\\Drivers\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox/");
    }

    @Test(dataProvider = "DataProviderForCheckBoxCheckingXpath", dataProviderClass = DataProviderForCheckBoxCkecking.class)
    public void verifyStringOne(String name) {
        chromeDriver.findElement(By.xpath(name)).click();
    }

    @Test(dataProvider = "DataProviderForCheckBoxCheckingCSS", dataProviderClass = DataProviderForCheckBoxCkecking.class)
    public void verifyStringTwo(String name) {
        chromeDriver.findElement(By.cssSelector(name)).click();
    }

}

