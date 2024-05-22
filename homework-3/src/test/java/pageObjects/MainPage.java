package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public MainPage() {
        check();
    }
    private final SelenideElement sidebar = $x("//div[@id='hook_Block_AsideColumn']");
    private final SelenideElement findFriendsButton = $x("//div[@class='tico']");
    private final SelenideElement invisibleButton = $x("//input[@class='checkable_target tumbler_target']");
    private final SelenideElement invisibleModal = $x("//div[@class='modal-new __size-pay __full-screen']");
    private final SelenideElement groupsSidebar = $x("//a[@data-l='t,userAltGroup']");
    private final SelenideElement topRightProfile = $x("//button[@aria-label='Настройки профиля']");
    private final SelenideElement logOutButtonProfile = $x("//div[@class='toolbar_accounts-user-delete-button']");
    private final SelenideElement finalLogOutButton = $x("//input[@name='logoff.confirm_not_decorate']");
    private final SelenideElement closeInvisibleModalButton = $x("//div[@class='closer js-closer' and @aria-label='Закрыть окно' and @role='button']");
    private final SelenideElement avatarForm = $x("//div[@id='hook_Block_Avatar']");
    private final SelenideElement blockMomentsAndIlluminations = $x("//div[@class='alternative-content-block__hcz2a']");

    // нажать кнопку "Невидимка"
    public void pressInvisibleButton(){
        invisibleButton.shouldBe(visible).click();
    }

    // закрыть модуль "Невидимка"
    public void pressExitInvisibleModalButton() {
        closeInvisibleModalButton.shouldBe(visible).click();
    }

    // проверка появления модуля "Неведимка"
    public boolean checkInvisibleModal(){
        return invisibleModal.isDisplayed();
    }

    // нажать на кнопку "Группы"
    public void pressGroupsSidebar(){
        groupsSidebar.shouldBe(visible).click();
    }

    // нажать на кнопку профиля в правом верзнем углу
    public void pressTopRightProfile() {
        topRightProfile.shouldBe(visible).click();
    }

    // проверка подлинности страницы
    public boolean check() {
        sidebar.shouldBe(visible);
        avatarForm.shouldBe(visible);
        blockMomentsAndIlluminations.shouldBe(visible);
        return true;
    }

    // нажать кнопку "Выйти" в меню профиля
    public void pressLogOutButtonProfile() {
        pressTopRightProfile();
        logOutButtonProfile.shouldBe(visible).click();
    }

    // нажать последнюю кнопку при выходе из профиля "Выйти"
    public void pressFinalLogOutButton() {
        pressLogOutButtonProfile();
        finalLogOutButton.shouldBe(visible).click();
    }

    // выйти из профиля
    public void logOutProfile() {
        pressFinalLogOutButton();
    }
}
