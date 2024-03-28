package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement sidebar = $x("//div[@id='hook_Block_AsideColumn']");
    private final SelenideElement findFriendsButton = $x("//div[@class='tico']");
    private final SelenideElement invisibleButton = $x("//input[@class='checkable_target tumbler_target']");
    private final SelenideElement invisibleModal = $x("//div[@class='modal-new __size-pay __full-screen']");
    private final SelenideElement groupsSidebar = $x("//a[@data-l='t,userAltGroup']");

    public SelenideElement getSidebar(){
        return sidebar;
    }

    // нажать кнопку "Невидимка"
    public void pressInvisibleButton(){
        invisibleButton.shouldBe(visible).click();
    }

    // проверка появления модуля "Неведимка"
    public boolean checkInvisibleModal(){
        return invisibleModal.isDisplayed();
    }

    // нажать на кнопку "Группы"
    public void pressGroupsSidebar(){
        groupsSidebar.shouldBe(visible).click();
    }
}
