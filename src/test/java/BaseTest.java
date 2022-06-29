import com.microsoft.playwright.*;
import io.qameta.allure.Attachment;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.nio.file.Paths;

public class BaseTest {
/*
    private static Browser browser;
    public static Page page;

    private static final String url = "https://qmur.gettalkdesk.com/atlas/apps/home";


    @BeforeAll
    static void setUp(){

        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        page = browser.newPage();
        page.navigate(url);
    }

    @Attachment(value = "PageScreenAfterTest", type = "image/png")
    public byte[] screenshot() {
        return page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get("screenshot.png"))
                .setFullPage(true));
    }

    @AfterAll
    static void tearDown(){
        page.close();
        browser.close();
    }*/
}