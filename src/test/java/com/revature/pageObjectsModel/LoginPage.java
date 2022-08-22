package com.revature.pageObjectsModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(tagName = "button")
    private WebElement loginButton;

    public WebElement clickLoginButton() {
        return loginButton;
    }
}

