package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluAmazonSearch extends TestBaseRapor {
    @Test
    public void test(){
        extentTest=extentReports.createTest("Amazon arama Testi"+
                "Kullanıcı istediği kelimeyi aratabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik=ConfigReader.getProperty("amazonExpectedIcerik");

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }
}
