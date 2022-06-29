import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStatusTest extends BaseTest {

    UserStatusPage userStatusPage = new UserStatusPage(page);

    @Test
    @Step("Check the stuff")
    public void isTheCardThere(){

        assertEquals(userStatusPage.getDefaultStatus(), 1, "Default value");
        userStatusPage.clickDropdown();

    }
}