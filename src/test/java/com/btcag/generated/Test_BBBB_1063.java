package com.btcag.generated;

import com.btcag.generated.parts.EweFooterPart;
import org.testng.annotations.Test;

public class Test_BBBB_1063 {

    @Test
    public void testFooterImpressumNavigation() {
        new EweFooterPart()
                .navigateToHomepage()
                .assertFooterIsVisible()
                .openImpressum()
                .assertImpressumIsOpened();
    }
}