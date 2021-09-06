package test_case;

import base_class.DriverSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TC01_VerifyTestTitle extends DriverSetup {

    public static String baseURL = "http://18.209.122.163/admin/login";


    @Test
    public static void pageTitleVerify(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get(baseURL);

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Login :: Backpack Admin Panel";
        Assert.assertEquals(ActualTitle,ExpectedTitle);


    }



}
