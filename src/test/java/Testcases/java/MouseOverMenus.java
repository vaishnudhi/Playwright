package Testcases.java;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MouseOverMenus {
    public static void main(String[] args) throws InterruptedException {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.way2automation.com/");
        page.locator("#menu-item-27580 > a > span.menu-text").hover();
        Thread.sleep(2000);
        page.locator("#menu-item-27592 > a > span.menu-text").click();

    }
}
