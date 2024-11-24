package Testcases.java;

import com.microsoft.playwright.*;

import java.awt.*;

public class LaunchBrowser {
    public static void main (String[] args)throws InterruptedException{
        //System.out.println("Hai");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        System.out.println(width+"--"+height);

        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        //const { chromium } = require('playwright');
        //(async () => {
        //const browser = await chromium.launch();
        //const page = await browser.newPage();
        //await page.goto('https://example.com');
        //await browser.close();
        //})();
        BrowserContext browserContext=browser.newContext(new Browser.NewContextOptions().setViewportSize((int)width,(int)height));
        Page page=browserContext.newPage();
        page.navigate("http://localhost:5170/");
        //page.waitForSelector();
        System.out.println(page.title());
        Thread.sleep(2000);
        //page.close();
        //playwright.close();


    }


}
