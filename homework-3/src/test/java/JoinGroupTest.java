import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.GroupsPage;
import pageObjects.MainPage;
import pageObjects.TheGroupPage;

import static com.codeborne.selenide.Selenide.sleep;

public class JoinGroupTest extends BaseTestAfterLogIn {

    @Test
    // проверка вступления в группу
    public void joinGroupTest(){
        MainPage mainPage = new MainPage();
        mainPage.pressGroupsSidebar();
        sleep(2000);
        GroupsPage groupsPage = new GroupsPage();
        groupsPage.pressButtonJoinGroup();
        sleep(2000);
        Assertions.assertEquals("Вы в группе", groupsPage.getStatusSubscription());
    }

    @AfterEach
    // отписаться от группы
    public void unsubscribeGroup() {
        Selenide.refresh();
        GroupsPage groupsPage = new GroupsPage();
        groupsPage.pressMyFirstGroup();
        TheGroupPage theGroupPage = new TheGroupPage();
        theGroupPage.exitGroup();
        sleep(2000);
        theGroupPage.backToMainPage();
    }
}
