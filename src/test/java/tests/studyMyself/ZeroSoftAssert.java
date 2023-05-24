package tests.studyMyself;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ZeroSoftAssert {

    @Test
    public void test01(){
        //Yeni bir Class Olusturun : C03_SoftAssert
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroURL"));
        //2. Sign in butonuna basin
        ZeroPage zeroPage=new ZeroPage();
        zeroPage.signInButton.click();
        //3. Login kutusuna “username” yazin
        zeroPage.logInButton.sendKeys("username");
        //4. Password kutusuna “password” yazin
        zeroPage.passWord.sendKeys("password");

        //5. Sign in tusuna basin
        zeroPage.sinInButton2.click();
        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        Driver.getDriver().navigate().back();
        zeroPage.onlineBankingButton.click();
        //Pay Bill Butonuna tıkla
        zeroPage.payBill.click();
        //7. “Purchase Foreign Currency” tusuna basin
        zeroPage.PurchaseText.click();
        //8. “Currency” drop down menusunden Eurozone’u secin
        Select select=new Select(zeroPage.currencyDropdown);
        select.selectByValue(ConfigReader.getProperty("zeroSecilenCurrencyValue"));
        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(zeroPage.selectCurrencyText.isDisplayed());

        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin




      // List<WebElement> expectedList=zeroPage.dropdownList;
      // List<String> actualList=new ArrayList<>(Arrays.asList("\"Select One\", \"Australia (dollar)\", \"Canada (dollar)\",\"Switzerland (franc)\",\"China \n" +
      //         "(yuan)\",\"Denmark (krone)\",\"Eurozone (euro)\",\"Great Britain (pound)\",\"Hong Kong \n" +
      //         "(dollar)\",\"Japan (yen)\",\"Mexico (peso)\",\"Norway (krone)\",\"New Zealand \n" +
      //         "(dollar)\",\"Sweden (krona)\",\"Singapore (dollar)\",\"Thailand (baht"));

      // for (int i = 0; i <expectedList.size() ; i++) {
      //     for (int j = 0; j <actualList.size() ; j++) {
      //         if (expectedList.get(i).getText().equalsIgnoreCase(actualList.get(j))){

      //         }


      //     }

      // }



        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht
    }
}