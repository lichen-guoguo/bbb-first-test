package com.btcag.generated;

import com.btcag.generated.parts.EweCookiePart;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("BBBB-1064")
public class Test_BBBB_1064 {

    @Feature("Datenschutz-Einstellungen")
    @Description("Startseite öffnen, Cookie-Popup ablehnen und prüfen, dass kein Logins-Button vorhanden ist")
    @Test
    public void testNoLoginButtonAfterCookieRejection() {
        new EweCookiePart()
                .openHomepage()
                .rejectCookies()
                .assertNoLoginButton();
    }
}