import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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


    @Test
    @Tag("regresja")
    @Tag("SiiPortal")
    public void siiPortalTitleTest() {
        driver.get("http://siiportal.sii.pl/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Strona główna Rzeszów";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    @Tag("regresja")
    @Tag("Onet")
    public void onetTitleTest() {
        driver.get("https://www.onet.pl/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Onet – Jesteś na bieżąco";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    @Tag("regresja")
    @Tag("kotuszkowo")
    public void kotuszkowoTitleTest() {
        driver.get("http://kotuszkowo.pl/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Kotuszkowo- blog o kotach";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    @Tag("regresja")
    @Tag("filmweb")
    public void filmwebTitleTest() {
        driver.get("http://filmweb.pl/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Filmweb - filmy takie jak Ty!";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    @Tag("regresja")
    @Tag("selenium")
    public void seleniumdevTitleTest() {
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "WebDriver :: Documentation for Selenium";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

}
