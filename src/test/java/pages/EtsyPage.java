package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyPage {
public EtsyPage() {

    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(xpath = "//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='submit_attempt']")
    public WebElement signInLogin;

    @FindBy(xpath = "(//a[@class='wt-text-link-no-underline'])[2]")
    public WebElement headerShoesLink;

    @FindBy(xpath = "(//form[@id='gnav-search']")
    public WebElement headerSearch;

    @FindBy(xpath = "(//div[@class='wt-image-placeholder--1-1'])[17]")
    public WebElement shoesIcon;


}



