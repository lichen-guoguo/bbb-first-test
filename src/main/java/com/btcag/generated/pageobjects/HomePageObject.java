package com.btcag.generated.pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitUntilState;
import com.btcag.generated.data.TestData;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePageObject extends BasePageObject {

    public void navigateToHomepage() {
        page.navigate(TestData.BASE_URL, new Page.NavigateOptions()
                .setWaitUntil(WaitUntilState.LOAD));
    }

    public void acceptCookieConsent() {
        Locator consentButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Datenschutz-Einstellungen"));
        if (consentButton.isVisible()) {
            consentButton.click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                    .setName("Zustimmen")).click();
            page.waitForLoadState(LoadState.LOAD);
        }
    }

    public void clickZumServicebereich() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum Servicebereich von EWE")).click();
    }

    public void clickPauseOnTrailer() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Pause")).first().click();
    }

    public void assertTrailerIsPlayable() {
        Locator pauseButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("Pause")).first();
        assertThat(pauseButton).isVisible();
    }

    public void assertTrailerCanPlay() {
        Locator slideButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions()
                .setName("1").setExact(true)).first();
        assertThat(slideButton).isVisible();
    }

    public void assertPageIsLoaded() {
        assertThat(page).hasURL(TestData.BASE_URL + "/");
    }
}