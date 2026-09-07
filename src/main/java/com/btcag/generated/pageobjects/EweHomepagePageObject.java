package com.btcag.generated.pageobjects;

import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.Page;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class EweHomepagePageObject extends BasePageObject {

    public void navigateToHomepage() {
        page.navigate("https://www.ewe.de");
        page.waitForLoadState();
    }

    public void clickDatenschutzEinstellungen() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Datenschutz-Einstellungen")).click();
    }

    public void clickAblehnen() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Ablehnen")).click();
    }

    public void assertNoLoginButtonExists() {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Login").setExact(true))).hasCount(0);
    }
}