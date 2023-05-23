package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluSoftAssert extends TestBaseRapor {
    @Test
    public void test01() throws InterruptedException {
        // 1. Test
        //            -  https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
        //            - 1.alert'e tiklayin
        Thread.sleep(3000);
        WebElement ilkClivWebElementi=Driver.getDriver().findElement(By.xpath("//*[text()='Click for JS Alert']"));
        ilkClivWebElementi.click();

        SoftAssert softAssert=new SoftAssert();

        //            -  Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        Thread.sleep(3000);
        String expectedAlertYazisi = "I am a JS Alert";
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();
        softAssert.assertEquals(actualAlertYazisi,expectedAlertYazisi);
        //            -  OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();

        //Allertunkapatıldığını test edin





    }
}
