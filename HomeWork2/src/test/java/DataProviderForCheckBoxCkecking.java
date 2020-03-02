import org.testng.annotations.DataProvider;

public class DataProviderForCheckBoxCkecking {
    @DataProvider(name = "DataProviderForCheckBoxCheckingXpath")
    public static Object[][] checkBoxXpath() {
        return new Object[][]{
                {"(//input[contains(@type,\"checkbox\")])[1]"},
                {"(//input[contains(@type,\"checkbox\")])[2]"},
                {"(//input[contains(@type,\"checkbox\")])[3]"},
        };
    }

    @DataProvider(name = "DataProviderForCheckBoxCheckingCSS")
    public static Object[][] checkBoxCSS() {
        return new Object[][]{
                {"div>input[value=checkbox-1]"},
                {"div>input[value=checkbox-2]"},
                {"div>input[value=checkbox-3]"},
        };
    }
}