package com.btcag.generated.parts;

import com.btcag.generated.pageobjects.EweHomepagePageObject;
import com.btcag.generated.util.AllureUtils;

public class EweCookiePart {

    public EweCookiePart openHomepage() {
        AllureUtils.step("Startseite öffnen", () -> {
            new EweHomepagePageObject().navigateToHomepage();
        });
        return this;
    }

    public EweCookiePart rejectCookies() {
        AllureUtils.step("Ablehnen Button klicken, wenn Popup Datenschutz-Einstellungen geöffnet ist", () -> {
            EweHomepagePageObject homepage = new EweHomepagePageObject();
            homepage.clickDatenschutzEinstellungen();
            homepage.clickAblehnen();
        });
        return this;
    }

    public EweCookiePart assertNoLoginButton() {
        AllureUtils.step("Sicherstellen, dass kein Logins Button vorhanden ist", () -> {
            new EweHomepagePageObject().assertNoLoginButtonExists();
        });
        return this;
    }
}