package com.btcag.generated.parts;

import com.btcag.generated.pageobjects.HomePage;
import com.btcag.generated.util.AllureUtils;

public class HomePagePart {
    
    private final HomePage homePage;

    public HomePagePart() {
        this.homePage = new HomePage();
    }

    public void openHomePage(String url) {
        AllureUtils.step("Startseite aufrufen", () -> {
            homePage.page.navigate(url);
            homePage.page.waitForLoadState(); // Ensure the page is fully loaded
        });
    }

    public void verifyFooterVisible() {
        AllureUtils.step("Footer finden", () -> {
            if (!homePage.isFooterVisible()) {
                throw new AssertionError("Footer is not visible on the page.");
            }
        });
    }

    public void openImpressum() {
        AllureUtils.step("Impressum öffnen", homePage::clickImpressum);
    }
}