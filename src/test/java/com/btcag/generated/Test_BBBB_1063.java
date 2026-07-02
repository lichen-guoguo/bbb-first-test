package com.btcag.generated;

import com.btcag.generated.parts.HomePagePart;
import org.testng.annotations.Test;

public class Test_BBBB_1063 {

    @Test
    public void testFooterAndImpressum() {
        HomePagePart homePagePart = new HomePagePart();

        // Step 1: Navigate to the homepage
        homePagePart.openHomePage("https://example.com");

        // Step 2: Verify the footer is visible
        homePagePart.verifyFooterVisible();

        // Step 3: Open Impressum
        homePagePart.openImpressum();
    }
}