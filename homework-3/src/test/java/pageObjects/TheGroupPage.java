package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class TheGroupPage {
    public TheGroupPage() {
        check();
    }
    private final SelenideElement statusEntryGroup = $x("//span[@class='dropdown_ac button-pro __sec __with-arrow __arrow-svg __wide']");
    private final SelenideElement exitGroupButton = $x("//a[@class='dropdown_i']");
    private final SelenideElement finalExitGroupButton = $x("//input[@class='modal_buttons_yes button-pro']");
    private final SelenideElement mainPageButton = $x("//div[@id='topPanelLeftCorner']");
    private final SelenideElement mainHeaderOfGroup = $x("//div[@class='main-content-header_data_top']");
    private final SelenideElement mainNavigatorOfGroup = $x("//div[@class='main-content-header_data_nav-menu']");

    // нажать на кнопку статуса группы
    public void pressStatusEntryGroup() {
        statusEntryGroup.shouldBe(visible).click();
    }

    // проверка подлинности страницы
    public boolean check() {
        mainHeaderOfGroup.shouldBe(visible);
        mainNavigatorOfGroup.shouldBe(visible);
        return true;
    }

    // отписаться от группы
    public void exitGroup() {
        pressStatusEntryGroup();
        sleep(2000);
        exitGroupButton.shouldBe(visible).click();
        sleep(2000);
        finalExitGroupButton.shouldBe(visible).click();
    }

    // нажать на кнопку главной страницы в верхнем левом углу
    public void backToMainPage() {
        mainPageButton.shouldBe(visible).click();
    }
}