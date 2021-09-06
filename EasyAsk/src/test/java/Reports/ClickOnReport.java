package Reports;

import base_class.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickOnReport extends DriverSetup {

    @Test
    public void openReport(){

        //WebElement
        WebElement openReport = driver.findElement(By.xpath("/html//div[@class='app-body']/div/nav/ul[@class='nav']/li[2]/a[@href='#']"));
        openReport.click();
    }

}
