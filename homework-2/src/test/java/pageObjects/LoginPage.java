package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private final SelenideElement loginInputField = $x("//input[@name='st.email']");
    private final SelenideElement passwordInputField = $x("//input[@name='st.password']");
    private final SelenideElement loginButton = $x("//input[@value='Войти в Одноклассники']");

    public LoginPage(String url){
        Selenide.open(url);
    }

    // пройти авторизацию
    public void logIn(String login, String password){
        enterLogin(login);
        enterPassword(password);
        pressLoginButton();
    }

    // ввести логин
    public void enterLogin(String login){
        loginInputField.shouldBe(visible).setValue(login);
    }

    // ввести пароль
    public void enterPassword(String password){
        passwordInputField.shouldBe(visible).setValue(password);
    }

    // нажать кнопку "Войти в Одноклассники"
    public void pressLoginButton(){
        loginButton.shouldBe(visible).click();
    }
}
