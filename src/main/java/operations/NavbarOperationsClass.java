package operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.NavbarPageObject;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NavbarOperationsClass {
    private NavbarPageObject navbarPageObject;
    private WebDriver driver;

    public NavbarOperationsClass(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPremierLeague() {
        Actions action = new Actions(driver);
        action.moveToElement(navbarPageObject.getFootballNavbarElement()).perform();
        navbarPageObject.getPremierLeagueLink().click();
    }

    public void checkPremierLeague() {
        assertThat(driver.getCurrentUrl()).contains("/news/football/premier-league/");
        assertThat(navbarPageObject.getPremierLeagueTitle().isDisplayed());
    }
}
