package test_case;

import Reports.ClickOnReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC02_NewReport extends ClickOnReport {

    @Test
    public void clickonNewReport(){

        // Click on NewReport
        WebElement clickOnReport = driver.findElement(By.xpath("/html//div[@class='app-body']/div/nav/ul[@class='nav']/li[2]/ul[@class='nav-dropdown-items']//a[@href='http://18.209.122.163/admin/new-report']"));

        clickOnReport.click();

    }




}
