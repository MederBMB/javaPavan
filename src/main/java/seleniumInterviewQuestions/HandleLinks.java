package seleniumInterviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class HandleLinks {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mashina.kg/");
        driver.manage().window().maximize();

       // driver.findElement(By.linkText("Мото")).click();
        // driver.findElement(By.partialLinkText("Мот")).click();

        //How to capture all the links
        List <WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println("Number of links present: " + links.size());

        //For loop to read all links

        /*for(int i=0; i<=links.size(); i++){
            //System.out.println(links.get(i).getText());
            System.out.println(links.get(i).getAttribute("href"));
        }*/

        // For each loop
        for(WebElement link:links){
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }

    }
}
