package com.btcag.generated.pageobjects;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage extends BasePageObject {

    // ======================== Navigation ========================

    public void navigateToHomepage() {
        page.navigate("https://www.ewe.de");
    }

    public void navigateToImpressum() {
        page.navigate("https://www.ewe.de/impressum");
    }

    public void navigateToDatenschutz() {
        page.navigate("https://www.ewe.de/datenschutz");
    }

    // ======================== Header / Navigation ========================

    public void clickFuerZuhause() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Für Zuhause")).first().click();
    }

    public void clickFuerUnternehmen() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Für Unternehmen")).first().click();
    }

    // ======================== Leistungen / Services ========================

    public void clickStrom() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Strom")).first().click();
    }

    public void clickGas() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Gas")).first().click();
    }

    public void clickInternet() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Internet")).first().click();
    }

    public void clickMobilfunk() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Mobilfunk")).first().click();
    }

    // ======================== Tarife / Preise ========================

    public void clickZuDenTarifen() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Zu den Tarifen")).click();
    }

    public void enterPostleitzahl(String plz) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions()
                .setName("Postleitzahl *")).fill(plz);
    }

    // ======================== Footer Links ========================

    public void clickImpressum() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum Impressum")).click();
    }

    public void clickDatenschutz() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum EWE-Datenschutz")).click();
    }

    // ======================== Assertions ========================

    public void assertHomepageTitle() {
        assertThat(page).hasTitle("Energie, Solar, Wärme, Internet & Mobilfunk von EWE");
    }

    public void assertImpressumTitle() {
        assertThat(page).hasTitle("Impressum von EWE");
    }

    public void assertDatenschutzTitle() {
        assertThat(page).hasTitle("Datenschutzerklärung von EWE");
    }

    public void assertImpressumHeadingVisible() {
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions()
                .setName("Impressum"))).isVisible();
    }

    public void assertDatenschutzHeadingVisible() {
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions()
                .setName("Datenschutzerklärung"))).isVisible();
    }

    public void assertFooterVisible() {
        assertThat(page.getByRole(AriaRole.CONTENTINFO)).isVisible();
    }

    public void assertServicesSectionVisible() {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Strom")).first()).isVisible();
    }

    public void assertTariffSectionVisible() {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Zu den Tarifen"))).isVisible();
    }

    public void assertLinkFuerZuhauseVisible() {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Für Zuhause")).first()).isVisible();
    }

    public void assertLinkFuerUnternehmenVisible() {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Für Unternehmen")).first()).isVisible();
    }

    public void assertImpressumLinkInFooterVisible() {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum Impressum"))).isVisible();
    }

    public void assertDatenschutzLinkInFooterVisible() {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum EWE-Datenschutz"))).isVisible();
    }
}