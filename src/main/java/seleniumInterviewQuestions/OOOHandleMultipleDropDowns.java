//package seleniumInterviewQuestions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//public class OOOHandleMultipleDropDowns {
//    public static WebDriver driver;
//    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
//        driver.get("https://www.mashina.kg/");
////        Actions actions = new Actions(driver);
//          //1)
//
////        WebElement element = driver.findElement(By.xpath("//body/header[@id='header']/div[@class='bound-header']/nav[@id='nav']/div[@class='primary-link-wrap']/ul[@class='level-one-ul']/li[1]"));
////        actions.moveToElement(element).perform();
////        WebElement eleDir = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/ul/li[1]/ul/li[1]/a"));
////        actions.click(eleDir);
//        WebElement markaBtn=driver.findElement(By.xpath("//span[contains(text(),'Марка: любая')]"));
//        markaBtn.click();
//        Thread.sleep(3000);
//        WebElement bmw=driver.findElement(By.xpath("//button[@title='Марка: любая']"));
//        bmw.click();
//        Assert.assertEquals();
////         Select mark = new Select(bmw);
////        mark.selectByVisibleText("BMW");
////        Select model = new Select(driver.findElement(By.xpath("//span[contains(text(),'Модель: любая')]")));
////        model.selectByVisibleText("3 серии");
////        Select yy = new Select(driver.findElement(By.xpath("//div[@class='selectize-input items not-full has-options']")));
////        yy.selectByValue("2020");
//         //NE RABOTAET
////        Select issuesDrp = new Select(driver.findElement(By.xpath("//a[normalize-space()='Issues']")));
////        issuesDrp.selectByVisibleText("Safety");
////        //NE RABOTAET
////        Select workExperienceDrp = new Select(driver.findElement(By.xpath("//select[@name='experience_id']")));
////        workExperienceDrp.selectByVisibleText("1-3 года");
////
////          //2)
////        WebElement profSectorDrp = driver.findElement(By.xpath("//select[@name='prof_id']"));
////        selectOptionFromDropDown(profSectorDrp, "9");
////       // WebElement specializationDrp = driver.findElement(By.xpath("//select[@name='spec_id']"));
////       // WebElement workExperienceDrp = driver.findElement(By.xpath("//select[@name='experience_id']"));
////
////    }
////    public static void selectOptionFromDropDown(WebElement element, String value){
////        Select drp = new Select(element);
////        List<WebElement> allOptions = drp.getOptions();
////        for (WebElement option : allOptions){
////            if(option.getText().equals("Cuba")){
////                option.click();
////                break;
////            }
////        }
////
////    static WebDriver driver;
////    public static void main(String[] args) {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
//    }
//}
