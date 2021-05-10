import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckTitleTests {

    private WebDriver driver;

    @BeforeAll
    static void connect() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void cleanUp() {
        driver.quit();
    }


    @ParameterizedTest
    @ValueSource(strings = {"Strona główna Rzeszów"})
    @Tag("regresja")
    @Tag("siiportal")
    public void siiPortalTitleTest(String expectedTitle) {
        driver.get("http://siiportal.sii.pl/");
        String actualTitle = driver.getTitle();
        assertThat(expectedTitle, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @Tag("regresja")
    @Tag("onet")
    public void onetTitleTest(String expectedTitle) {
        driver.get("https://www.onet.pl/");
        String actualTitle = driver.getTitle();
        assertThat(expectedTitle, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @Tag("regresja")
    @Tag("kotuszkowo")
    public void kotuszkowoTitleTest(String expectedTitle) {
        driver.get("http://kotuszkowo.pl/");
        String actualTitle = driver.getTitle();
        assertThat(expectedTitle, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @Tag("regresja")
    @Tag("filmweb")
    public void filmwebTitleTest(String expectedTitle) {
        driver.get("http://filmweb.pl/");
        String actualTitle = driver.getTitle();
        assertThat(expectedTitle, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver :: Documentation for Selenium"})
    @Tag("regresja")
    @Tag("selenium")
    public void seleniumdevTitleTest(String title) {
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        String actualTitle = driver.getTitle();
        assertThat(title, equalTo(actualTitle));
    }

}
