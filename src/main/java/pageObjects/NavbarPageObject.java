package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavbarPageObject {
    private WebDriver driver;

    public NavbarPageObject(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "menu-item-309006")
    private WebElement footballNavbarElement;

    @FindBy(id = "menu-item-309007")
    private WebElement premierLeagueLink;

    @FindBy(xpath = "//h1[contains(text(), 'Premier League')]")
    private WebElement premierLeagueTitle;

    public WebElement getFootballNavbarElement() {
        return footballNavbarElement;
    }

    public WebElement getPremierLeagueLink() {
        return premierLeagueLink;
    }

    public WebElement getPremierLeagueTitle() {
        return premierLeagueTitle;
    }
}
