package seleniumInterviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsElements {
    //DIFFERENCE                         findElement()                        findElements()
    //Single WebElement Present      returns single Element                returns multiple Elements
    //Multiple WebElements Present   returns first Element                 returns all Elements
    //Element not Present            Throws NoSuchElementException         Does not throw any Exception. Returns zero Elements
    //Return type                    WebElement                            List <WebElement>
    //Access                         Directly                              Iterate the list of Elements

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        //findElement()

        //Scenario 1 ---> returns single Element
        /*WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("XYZ");

        //Scenario 2 ---> returns first Element
        WebElement element = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(element.getText());

        //Scenario 3 ---> Throws NoSuchElementException
        WebElement searchButton = driver.findElement(By.xpath("//button[normalize-space()='login']"));*/

        //findElements()
        //Scenario 1 ---> returns multiple web elements
        /*List<WebElement>links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("Number of elements captured: " + links.size());

        for(WebElement element:links){
            System.out.println(element.getText());
        }*/

        //Scenario 2 ---> returns all Elements
        /*List<WebElement>logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(logo.size()); //vse ravno hranit v liste, a razmer = kolichestvu elementov, zdes' 1*/

        //Scenario 3 ---> Does not throw any Exception. Returns zero Elements
        List<WebElement>elements = driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
        System.out.println(elements.size());   //0


    }


}
