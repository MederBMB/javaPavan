package seleniumInterviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.asn1.eac.CertificateHolderReference;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class GetTextVsGetAttributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login");
        WebElement emailInputBox = driver.findElement(By.id("Email"));
        //emailInputBox.clear();     //----> clear old value "admin@yourstore.com"
        //emailInputBox.sendKeys("admin123@gmail.com");

        //capturing text from inputbox
        System.out.println("Result from getAttribute() method: " + emailInputBox.getAttribute("value"));
        //getAttribute() which return a value of any attribute
        //getAttribute("name") ---> email
        //getAttribute("id") ---> user
        //getAttribute("value") ---> admin@yourstore.com
        System.out.println("Result from getText() method: " + emailInputBox.getText());
        //getText() ---> return text, if there is no inner text it returns empty, null

        //Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        System.out.println(loginButton.getAttribute("type"));
        System.out.println(loginButton.getAttribute("class"));

        System.out.println(loginButton.getText());

        String title = driver.findElement(By.xpath(" //div[@class='page-title']//h1")).getText();
        System.out.println(title);
        driver.close();

    }
}
