package Testcases.java;

import com.microsoft.playwright.*;

public class IFrames {
    public static void main(String[] args) throws InterruptedException {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
        //page.frameLocator("[name='iframeresult']").locator("body > button").click((new ClickOptions().setTimeout(2000)));
        page.frameLocator("[name='iframeResult']").locator("body > button").click(new Locator.ClickOptions().setTimeout(2000));
    }
}