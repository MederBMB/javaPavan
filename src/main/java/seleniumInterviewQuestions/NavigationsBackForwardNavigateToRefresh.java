package seleniumInterviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationsBackForwardNavigateToRefresh {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.snapdeal.com/");
//        driver.get("https://www.amazon.com/"); //wait till page load
        driver.navigate().to("https://www.amazon.com/"); //does not wait till page load
        //Both methods are used for opening URL. There is no difference between them.
        // The only difference is that can be found in the parameters.
        // get() accepts only one String parameter.
        // navigate().to accepts String parameter and URL instance as parameter.

        driver.navigate().back();        // snapdeal page
        driver.navigate().forward();     // amazon page
        driver.navigate().refresh();     // refresh or reload the page

    }
}
