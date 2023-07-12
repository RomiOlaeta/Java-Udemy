package BasePage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;



    

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver","C:\Users\Romina\Desktop\practica udemy selenium\Java Udemy");
        ChromeOptions ChromeOptions = new ChromeOptions();
        driver = new ChromeDriver(ChromeOptions);
        wait = new WebDriverWait(driver,8);
        public BasePage(WebDriver driver){
            BasePage.driver = driver;
            wait = new WebDriverWait(driver, 10);
        }
        public static void navigateTo(String url){
            driver.get(url);
        }
        private WebElement Find(String locator) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by.xpath(locator)));

            public void clickElement(String locator){
                Find((locator).click());
            
        }}
    }
}
