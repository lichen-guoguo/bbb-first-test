package com.btcag.generated.parts;

import com.btcag.generated.pageobjects.HomePage;
import com.btcag.generated.util.AllureUtils;
import com.btcag.generated.data.EweTestData;

public class HomePagePart {

    public HomePagePart navigateToHomepage() {
        AllureUtils.step("Startseite besuchen", () -> {
            new HomePage().navigateToHomepage();
        });
        return this;
    }

    public HomePagePart verifyHomepageLoaded() {
        AllureUtils.step("Startseite aufgerufen", () -> {
            new HomePage().assertHomepageTitle();
        });
        return this;
    }

    public HomePagePart verifyServicesFound() {
        AllureUtils.step("Leistungen finden", () -> {
            new HomePage().assertServicesSectionVisible();
        });
        return this;
    }

    public HomePagePart verifyTargetAudienceFound() {
        AllureUtils.step("Zielgruppe finden", () -> {
            new HomePage().assertLinkFuerZuhauseVisible();
            new HomePage().assertLinkFuerUnternehmenVisible();
        });
        return this;
    }

    public HomePagePart verifyPricesFound() {
        AllureUtils.step("Preise finden", () -> {
            new HomePage().assertTariffSectionVisible();
        });
        return this;
    }

    public HomePagePart openImpressum() {
        AllureUtils.step("Impressum aufrufen", () -> {
            new HomePage().clickImpressum();
            new HomePage().assertImpressumTitle();
        });
        return this;
    }

    public HomePagePart verifyImpressumCompliant() {
        AllureUtils.step("Impressum vorhanden und konform", () -> {
            new HomePage().assertImpressumHeadingVisible();
        });
        return this;
    }

    public HomePagePart openDatenschutz() {
        AllureUtils.step("Datenschutzrichtlinie aufrufen", () -> {
            new HomePage().clickDatenschutz();
            new HomePage().assertDatenschutzTitle();
        });
        return this;
    }

    public HomePagePart verifyDatenschutzVisible() {
        AllureUtils.step("Datenschutzhinweise vorhanden", () -> {
            new HomePage().assertDatenschutzHeadingVisible();
        });
        return this;
    }
}