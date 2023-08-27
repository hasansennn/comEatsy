package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.EtsyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class EatsyStepdefinitions {
EtsyPage etsyPage=new EtsyPage();
Actions actions=new Actions(Driver.getDriver());
    @Given("Kullanıcı browser açar {string} gider")
    public void kullanıcı_browser_açar_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("etsyUrl"));


    }
    @Given("Homepage sayfasında sign in butonuna tiklar")
    public void homepage_sayfasında_sign_in_butonuna_tiklar() {
        etsyPage.signInButton.click();
    }
    @Given("\"Mail ve \"password\" bilgilerini girer")
    public void mail_ve_password_bilgilerini_girer() {


        actions.click(etsyPage.email).perform();
        actions.sendKeys(etsyPage.email).sendKeys(ConfigReader.getProperty("email"));
        actions.sendKeys(etsyPage.password).sendKeys(ConfigReader.getProperty("password"));

    }
    @Given("\"Sign in ikonunu tiklar")
    public void sign_in_ikonunu_tiklar() {
        actions.click(etsyPage.signInLogin).perform();
        ReusableMethods.bekle(4);
    }

        @Given("Search ikonu tiklanir ve\"shoes\" yazilir enter yapilir")
        public void search_ikonu_tiklanir_ve_shoes_yazilir_enter_yapilir() {
          actions.click(etsyPage.headerSearch);
           etsyPage.headerSearch.sendKeys("shoes");

        }
        @Given("shoesman tiklanir")
        public void shoesman_tiklanir() {
            actions.click(etsyPage.shoesIcon);
        }

    }

