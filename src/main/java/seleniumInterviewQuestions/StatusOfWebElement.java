package seleniumInterviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Calendar;

public class StatusOfWebElement {
    public static void main(String[] args) {
        //Conditional methods or conditional commands
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");

        //is Displayed()    isEnabled()    ------> boolean value
        //We can use this commands for any kind of elements (text, textbox, logo, labels, inputbox)
        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Display status: " + searchStore.isDisplayed());   //true
        System.out.println("Enable status: " + searchStore.isEnabled());      //true

        //is Selected()    ------> boolean value
        //We can use this commands for radio buttons, dropdowns, checkboxes
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println(male.isSelected());    //false
        System.out.println(female.isSelected());  //false

        male.click(); //selects male radio button
        System.out.println(male.isSelected());    //true
        System.out.println(female.isSelected());  //false

        female.click(); //selects female radio button
        System.out.println(male.isSelected());    //false
        System.out.println(female.isSelected());   //true




    }
}
