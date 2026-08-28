package com.btcag.generated.pageobjects;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ServicePageObject extends BasePageObject {

    public void assertServicePageIsLoaded() {
        assertThat(page).hasTitle("Service & Hilfe von EWE | Kontakt und Support");
    }

    public void clickWhatsAppService() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum WhatsApp-Service")).click();
    }

    public void clickRueckrufservice() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum Rückrufservice")).click();
    }

    public void assertSupportChatOptionsVisible() {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                .setName("Zum WhatsApp-Service"))).isVisible();
    }
}