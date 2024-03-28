import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.GroupsPage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class JoinGroupTest extends BaseTest {

    @Test
    public void joinGroupTest(){
        MainPage mainPage = new MainPage();
        mainPage.pressGroupsSidebar();
        GroupsPage groupsPage = new GroupsPage();
        groupsPage.pressButtonJoinGroup();
        sleep(2000);
        Assertions.assertEquals("Вы в группе", groupsPage.getStatusSubscription());
    }
}
