package com.btcag.generated;

import com.btcag.generated.part.HomePart;
import com.btcag.generated.part.ServicePart;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("BBBB-1066")
public class Test_BBBB_1066 {

    @Test
    @Feature("Startseite")
    @Description("Startseite besuchen - Die EWE-Startseite wird aufgerufen")
    public void testStartseiteBesuchen() {
        new HomePart()
                .navigateToHomepage()
                .navigateToServicePage();
    }

    @Test
    @Feature("Supportchat")
    @Description("Supportchat aufrufen - Der Supportchat bzw. die Kontakt-Seite wird aufgerufen")
    public void testSupportchatAufrufen() {
        new HomePart()
                .navigateToHomepage()
                .navigateToServicePage();

        new ServicePart()
                .verifySupportChatOptions();
    }

    @Test
    @Feature("Trailer")
    @Description("Trailer auf der Startseite abspielen - Der Trailer/Video auf der Homepage wird gefunden und ist abspielbar")
    public void testTrailerAufStartseiteAbspielen() {
        new HomePart()
                .navigateToHomepage()
                .playTrailerOnHomepage();
    }
}