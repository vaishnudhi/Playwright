package Testcases.java;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class DropDownBol {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://amazon.com");


        //select by value
        page.selectOption("select", "search-alias=arts-crafts-intl-ship");

        //select by text
        //page.selectOption("Select",new SelectOption().setLabel("Baby"));

    }
}
