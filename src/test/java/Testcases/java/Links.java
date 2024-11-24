package Testcases.java;

import com.microsoft.playwright.*;

public class Links {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.wikipedia.org/");
        //Locator links = page.locator("a");
        //System.out.println("The links in the page");
        //System.out.println(links.count());

        /*for(int i=0;i< links.count();i++)
        {
            System.out.println(links.nth(i).innerText()+"-----"+links.nth(i).getAttribute("a"));
        }*/

        Locator block = page.locator("//*[@id=\"www-wikipedia-org\"]/footer/nav");
        Locator blocklinks = block.locator("a");
        System.out.println("The links in the page");
        System.out.println(blocklinks.count());

        for(int i=0;i< blocklinks.count();i++)
        {
            System.out.println(blocklinks.nth(i).innerText()+"-----"+blocklinks.nth(i).getAttribute("a"));
        }

        page.close();
        playwright.close();



    }



}
