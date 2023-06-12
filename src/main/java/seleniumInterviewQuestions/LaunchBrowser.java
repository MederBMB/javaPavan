package seleniumInterviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser{   // Запуск браузера
    public static void main(String[] args) {
        // 1) FIRST WAY  ****With download drivers****
        //сначала установим нужные нам версии браузеров

        //Chrome browser
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Админ\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        //1a) ChromeDriver driver = new ChromeDriver();
//        //1b)
//        WebDriver driver= new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/");

//        //FireFox browser -----> NE RABOTAET
//        System.setProperty("web-driver.gecko.driver", "C:\\Users\\Админ\\Downloads\\geckodriver-v0.32.2-win64.zip\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        //FirefoxDriver driver= new FirefoxDriver();
//        driver.get("https://demo.nopcommerce.com/");

        //Edge browser
//        System.setProperty("web-driver.edge.driver", "C:\\Users\\Админ\\Downloads\\edged-river_win64.zip\\msedgedriver");
//        //WebDriver driver = new EdgeDriver();
//        EdgeDriver driver= new EdgeDriver();
//        driver.get("https://demo.nopcommerce.com/");

        // SECOND WAY ****Using WebDriverManager****
        //Chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        //FireFox browser    ------> NE RABOTAET
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();

        //Edge browser
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Title of the web page is: " + driver.getTitle());
        System.out.println("Current URL of the web page is: " + driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}
