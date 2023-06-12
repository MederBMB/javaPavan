package seleniumInterviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropDown {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement drpCountryEle = driver.findElement(By.id("input-country"));

        Select drpCountry = new Select(drpCountryEle);

//        drpCountry.selectByVisibleText("Denmark");
//        drpCountry.selectByValue("10");   //Argentina
//        drpCountry.selectByIndex(10);      //Argentina. Index starts from 0, but in example tag starts without 0

        //Selecting option from dropdown without using methods
        List<WebElement> allOptions = drpCountry.getOptions();
        for (WebElement option : allOptions){
            if(option.getText().equals("Cuba")){
                option.click();
                break;
            }
        }

        //If we have multiple dropdowns in the page, we can create method which will select the dropdown
    }
}
