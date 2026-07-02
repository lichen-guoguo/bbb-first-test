package com.btcag.generated.pageobjects;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * Diese Klasse ist eine Vereinfachung der eigentlichen Basisklasse. Hier wurde lediglich die Page hinterlegt. Die
 * eigentliche Klasse besitzt mehr Funktionalität.
 */
public class BasePageObject {

    private static Page currentPage;
    public final Page page;

    public BasePageObject() {
        if (currentPage != null) {
            page = currentPage;
            return;
        }
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        currentPage = browser.newPage();
        page = currentPage;
    }
}
