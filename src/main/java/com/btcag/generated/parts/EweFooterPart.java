package com.btcag.generated.parts;

import com.btcag.generated.pageobjects.EweHomePageObject;
import com.btcag.generated.util.AllureUtils;

public class EweFooterPart {

    public EweFooterPart navigateToHomepage() {
        AllureUtils.step("Startseite aufrufen", () -> {
            new EweHomePageObject().navigateToHomepage();
        });
        return this;
    }

    public EweFooterPart assertFooterIsVisible() {
        AllureUtils.step("Footer finden - Footer am unterem Ende der Seite vorhanden", () -> {
            new EweHomePageObject().assertFooterIsPresent();
        });
        return this;
    }

    public EweFooterPart openImpressum() {
        AllureUtils.step("Impressum öffnen", () -> {
            new EweHomePageObject().clickImpressumLink();
        });
        return this;
    }

    public EweFooterPart assertImpressumIsOpened() {
        AllureUtils.step("Impressum lässt sich öffnen", () -> {
            new EweHomePageObject().assertImpressumPageIsDisplayed();
        });
        return this;
    }
}