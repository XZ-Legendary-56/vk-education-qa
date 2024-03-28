import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class InvisibleTest extends BaseTest {

    @Test
    public void invisibleModal() {
        MainPage mainPage = new MainPage();
        mainPage.pressInvisibleButton();
        sleep(3000);
        Assertions.assertTrue(mainPage.checkInvisibleModal());
    }
}
