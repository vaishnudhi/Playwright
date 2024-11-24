package Testcases.java;

import com.microsoft.playwright.*;

import java.awt.*;

public class TestLocator {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("http:gmail.com");
        //page.locator("#identifierId").type("trainer@way2automation.com");
        //page.locator("[id='identifierId']").type("trainer@way2automation.com");
        //page.locator("[type=email]").type("trainer@way2automation.com");
        page.type("#identifierId","trainer@way2automation.com",new Page.TypeOptions().setDelay(100));
        //page.click("text=Next");
        page.click("button:has-text('Next')");
        page.locator("[type=password]").fill("Sabelburg");
        page.click("button:has-text('Next')");
        Object yDmH0d;
        //System.out.println(page.locator("//*[@id="yDmH0d"]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span").innerText());
        System.out.println(page.locator("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span").innerText());


    }
}
