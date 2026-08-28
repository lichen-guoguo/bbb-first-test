package com.btcag.generated;

import com.btcag.generated.parts.HomePagePart;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

@Epic("BBBB-1065")
public class Test_BBBB_1065 {

    @Test
    @Feature("Footer")
    @Description("Verify that the homepage loads with services, target audience, prices, impressum and data privacy")
    public void testFooterAndLegalPages() {
        new HomePagePart()
                .navigateToHomepage()
                .verifyHomepageLoaded()
                .verifyServicesFound()
                .verifyTargetAudienceFound()
                .verifyPricesFound()
                .openImpressum()
                .verifyImpressumCompliant()
                .openDatenschutz()
                .verifyDatenschutzVisible();
    }
}