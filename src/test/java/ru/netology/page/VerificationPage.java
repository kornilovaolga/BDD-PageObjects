package ru.netology.page;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Condition.*;

public class VerificationPage {

    @FindBy(css = "[data-test-id=code] input")
    private SelenideElement codeField;
    @FindBy(css = "[data-test-id=action-verify]")
    private SelenideElement verifyButton;

    public DashboardPage validVerify(DataHelper.VerificationCode verificationCode) {
        codeField.setValue(verificationCode.getCode());
        verifyButton.click();
        return new DashboardPage();
    }
}