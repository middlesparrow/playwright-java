import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;

public class UserStatusPage {

    private final Page page;

    private final String statuses = "[data-pendo=UserStatusCardStatusDropdown]";

    private final String homeFrame = "[data-testid=frame-home]";

    private final String globalFilters = "[data-pendo=GlobalFilterButton]";

    public UserStatusPage(Page page) {
        this.page = page;
        LoginPage loginPage = new LoginPage(page);
        loginPage.login();
        page.waitForSelector(homeFrame);
        //page.waitForSelector(globalFilters);

    }

    public int countCards(){
        FrameLocator frameLocator = page.frameLocator(homeFrame);
        String cards = "[data-co-name=Card]";
        return frameLocator.locator(cards).count();
    }

    public int getDefaultStatus()
    {
        FrameLocator frameLocator = page.frameLocator(homeFrame);
        frameLocator.locator(statuses).waitFor();

        String defaultStatus = "//p[contains(text(),'All Online')]";
        return frameLocator.locator(defaultStatus).count();
    }

    public void clickDropdown(){

        FrameLocator frameLocator = page.frameLocator(homeFrame);
        frameLocator.locator(statuses).click();
        //page.pause();

        //Locator locator = page.frame(homeFrame).locator(statuses);
        //locator.click();
    }
}