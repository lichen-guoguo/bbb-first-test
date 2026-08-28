package com.btcag.generated.part;

import com.btcag.generated.pageobjects.HomePageObject;
import com.btcag.generated.util.AllureUtils;

public class HomePart {

    public HomePart navigateToHomepage() {
        AllureUtils.step("Startseite besuchen", () -> {
            new HomePageObject().navigateToHomepage();
        });
        AllureUtils.step("Cookie-Consent annehmen, falls sichtbar", () -> {
            new HomePageObject().acceptCookieConsent();
        });
        AllureUtils.step("Startseite wurde aufgerufen", () -> {
            new HomePageObject().assertPageIsLoaded();
        });
        return this;
    }

    public HomePart playTrailerOnHomepage() {
        AllureUtils.step("Trailer auf der Startseite abspielen", () -> {
            new HomePageObject().assertTrailerIsPlayable();
        });
        AllureUtils.step("Trailer gefunden und abspielbar", () -> {
            new HomePageObject().assertTrailerCanPlay();
        });
        return this;
    }

    public HomePart navigateToServicePage() {
        AllureUtils.step("Zum Servicebereich navigieren", () -> {
            new HomePageObject().clickZumServicebereich();
        });
        return this;
    }
}