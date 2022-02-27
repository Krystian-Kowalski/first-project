import config.TestBase;
import operations.NavbarOperationsClass;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

public class FootballTests extends TestBase {
    private NavbarOperationsClass navbarOperationsClass;

    @BeforeMethod
    private void initOperations(){
//        navbarOperationsClass = new NavbarOperationsClass(driver);
        this.navbarOperationsClass = new NavbarOperationsClass(driver);
    }

    @Test
    public void premierLeagueTest(){
        navbarOperationsClass.goToPremierLeague();
        navbarOperationsClass.checkPremierLeague();
    }
}
