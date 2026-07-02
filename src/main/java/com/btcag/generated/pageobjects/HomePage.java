package com.btcag.generated.pageobjects;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.LocatorAssertions;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage extends BasePageObject {

    private static final String FOOTER_LOCATOR = "footer";
    private static final String IMPRESSUM_LINK_TEXT = "Impressum";

    public HomePage() {
        super();
    }

    public boolean isFooterVisible() {
        try {
            assertThat(page.locator(FOOTER_LOCATOR)).isVisible(); // Add explicit wait for visibility
            return true;
        } catch (AssertionError e) {
            return false;
        }
    }

    public void clickImpressum() {
        page.getByText(IMPRESSUM_LINK_TEXT).click();
    }
}