import com.codeborne.selenide.Selenide;
import org.example.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class InvisibleTest extends BaseTestAfterLogIn {

    @Test
    // проверка появления модуля "Невидимка"
    public void invisibleModal() {
        MainPage mainPage = new MainPage();
        mainPage.pressInvisibleButton();
        sleep(2000);
        Assertions.assertTrue(mainPage.checkInvisibleModal());
    }

    // возвращение к MainPage
    @AfterEach
    public void comeBackMainPage() {
        Selenide.refresh();
    }
}
