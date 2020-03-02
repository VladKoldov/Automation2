import org.testng.annotations.DataProvider;

public class DataProviderForButtonTest {
    @DataProvider(name= "DataProviderForButtonTest")
    public static Object[][] button() {
        return new Object[][]{
                {"(//form//button[contains(@class,\"btn btn-lg btn-primary\")])[1]"},
                {"//form//button[contains(@class,\"btn btn-lg btn-success\")]"},
                {"//form//button[contains(@class,\"btn btn-lg btn-info\")]"},
                {"//form//button[contains(@class,\"btn btn-lg btn-warning\")]"},
                {"//form//button[contains(@class,\"btn btn-lg btn-danger\")]"},
                {"//form//button[contains(@class,\"btn btn-lg btn-link\")]"},
                {"(//form//button[contains(@class,\"btn btn-lg btn-primary\")])[2]"},
                {"(//form//button[contains(@class,\"btn btn-lg btn-primary\")])[3]"},
                {"(//form//button[contains(@class,\"btn btn-lg btn-primary\")])[4]"},
                {"(//form//button[contains(@class,\"btn btn-lg btn-primary\")])[5]"},
                {"(//form//button[contains(@class,\"btn btn-lg btn-primary\")])[6]"},
                {"(//form//div[contains(@class,\"btn-group\")])[3]"},
                {"//div[contains(@class,\"dropdown-menu show\")]/a"},
                {"(//form//div[contains(@class,\"btn-group\")])[3]"},
                {"(//div[contains(@class,\"dropdown-menu show\")]/a)[2]"},

        };
    }
}