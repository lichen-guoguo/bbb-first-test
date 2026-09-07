package com.btcag.generated.pageobjects;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class EweHomePageObject extends BasePageObject {

    private static final String BASE_URL = "https://www.ewe.de";

    public void navigateToHomepage() {
        page.navigate(BASE_URL);
    }

    public void assertFooterIsPresent() {
        assertThat(page.getByRole(AriaRole.CONTENTINFO)).isVisible();
    }

    public void clickImpressumLink() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum Impressum")).click();
    }

    public void assertImpressumPageIsDisplayed() {
        assertThat(page.getByRole(AriaRole.HEADING,
                new Page.GetByRoleOptions().setName("Impressum"))).isVisible();
    }
}