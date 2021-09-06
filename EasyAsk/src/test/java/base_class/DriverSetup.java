package base_class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class DriverSetup {

    public static WebDriver driver;

    public static String baseURL = "http://18.209.122.163/admin/dashboard";


    @BeforeSuite
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get(baseURL);

        // UserName
        WebElement uname = driver.findElement(By.name("email"));
        uname.sendKeys("superadmin@gmail.com");

        // Pass
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("superadmin");


        //Click Login
        WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[@class='container']/div//form[@role='form']//button[@type='submit']"));
        loginBtn.click();






    }

//    @AfterSuite
//    public void close(){
//        driver.close();
//    }

}
