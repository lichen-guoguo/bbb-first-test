package com.btcag.generated.part;

import com.btcag.generated.pageobjects.ServicePageObject;
import com.btcag.generated.util.AllureUtils;

public class ServicePart {

    public ServicePart verifySupportChatOptions() {
        AllureUtils.step("Supportchat aufrufen", () -> {
            new ServicePageObject().assertSupportChatOptionsVisible();
        });
        AllureUtils.step("Supportchat aufgerufen", () -> {
            new ServicePageObject().assertServicePageIsLoaded();
        });
        return this;
    }
}