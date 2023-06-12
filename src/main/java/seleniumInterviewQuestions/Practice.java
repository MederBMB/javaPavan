package seleniumInterviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Practice {
    public static void main(String[] args) throws Exception{

        /*  WebDriverManager.chromedriver().setup();
        WebDriver mers = new ChromeDriver();
        mers.manage().window().maximize();
        mers.get("https://www.mashina.kg/");

        WebElement poisk = mers.findElement(By.xpath("//button[@id='search-submit']"));
        //mers.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        poisk.click();

        WebElement marka = mers.findElement(By.xpath("(//span[@class='filter-option pull-left'])[1]"));
        marka.click();
        WebElement input = mers.findElement(By.xpath("(//input[@type='text'])[1]"));
        input.sendKeys("bmw");

        Robot robot= new Robot();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        WebElement model = mers.findElement(By.xpath("(//span[@class='filter-option pull-left'])[2]"));
        model.click();
        WebElement input2 = mers.findElement(By.xpath("(//input[@type='text'])[2]"));
        input2.sendKeys("x6");

        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        WebElement submit = mers.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

*/
        /*Scanner scanner = new Scanner(System.in);
       String inp = scanner.next();

        for (int i=0; i<100; i++){
            if(i<18){
                System.out.println("Ненормальный, Педофил");
        }

        }
        System.out.println("Нормальный");*/

        int a[] = {50, 30, 40, 20, 60};

        int max = a[0];

        for(int i=3; i<a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum element in array is: " + max);

        String f[]={"Diana", "Gulnara", "Nurjan"};
        System.out.println(Arrays.toString(f));

}
}



