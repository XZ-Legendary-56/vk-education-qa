import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Condition.visible;

public class LoginTest extends BaseTestAfterLogIn {

    @Test
    // проверка перехода на главную страницу
    public void checkLogIn(){
        MainPage mainPage = new MainPage();
        Assertions.assertTrue(mainPage.check());
    }
}
