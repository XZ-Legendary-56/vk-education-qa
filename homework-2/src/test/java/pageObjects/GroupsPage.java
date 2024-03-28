package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class GroupsPage {
    private final SelenideElement buttonJoinGroup = $x("//span[@class='button-core__0ej09 __size-s__0ej09 __view-secondary__0ej09 __wide__0ej09']");
    private final SelenideElement statusSubscription = $x("//span[@class='label__akitx __small-padding__akitx']");
    private  final SelenideElement nameGroup = $x("//a[@class='group-detailed-card_name']");

    // нажать на кнопку "Вступить"
    public void pressButtonJoinGroup(){
        buttonJoinGroup.shouldBe(visible).click();
    }

    // статус подписки
    public String getStatusSubscription(){
        return statusSubscription.innerText();
    }
}
