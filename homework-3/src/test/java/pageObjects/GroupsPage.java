package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class GroupsPage {
    public GroupsPage() {
        check();
    }
    private final SelenideElement buttonJoinGroup = $x("//span[@class='button-core__0ej09 __size-s__0ej09 __view-secondary__0ej09 __wide__0ej09']");
    private final SelenideElement statusSubscription = $x("//span[@class='label__akitx __small-padding__akitx']");
    private final SelenideElement myFirstGroup = $x("//img[@class='photo_img']");
    private final SelenideElement cardsOfGroups = $x("//div[@data-l='groupCard,POPULAR_GROUPS.popularTop']");
    private final SelenideElement createGroupButton = $x("//a[text()='Создать группу']");
    private final SelenideElement searchGroupField = $x("//input[@class='input__prt1l __size-m__prt1l input__t53m6 input-left__t53m6 input-field__9mvah']");

    // нажать на кнопку "Вступить"
    public void pressButtonJoinGroup(){
        buttonJoinGroup.shouldBe(visible).click();
    }

    // статус подписки
    public String getStatusSubscription(){
        return statusSubscription.innerText();
    }

    // нажать на мою группу
    public void pressMyFirstGroup() {
        myFirstGroup.shouldBe(visible).click();
    }

    // проверка подлинности страницы
    public boolean check() {
        createGroupButton.shouldBe(visible);
        cardsOfGroups.shouldBe(visible);
        searchGroupField.shouldBe(visible);
        return true;
    }
}
