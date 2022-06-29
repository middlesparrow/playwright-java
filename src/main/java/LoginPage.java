import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;

    private final String locator_login = "[type=email]";
    private final String locator_password = "[type=password]";

    private final String locator_submit = "[type=submit]";

    public LoginPage(Page page){
        this.page = page;
    }

    public void login(){

        page.fill(locator_login, "");
        page.fill(locator_password, "");

        page.fill(locator_login, "antonio.ferreira@talkdesk.com");
        page.fill(locator_password, "antonio@talkdesk");

        page.click(locator_submit);

    }
}