package Testcases.java;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import java.util.List;

public class DropDown {

    public static void main(String[] args){

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        //page.navigate("https://www.wikipedia.org/");
        page.navigate("https://www.amazon.com/");


        //select by value
        page.selectOption("select", "it");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("/file,"))
        //select by text
        //page.selectOption("select",new SelectOption().setLabel("தமிழ்"));

        //select by index
        //page.selectOption("select",new SelectOption().setIndex(2));

       Locator values = page.locator("select > option");
        System.out.println(values.count());

        for(int i=0; i<values.count() ;i++){

            System.out.println(values.nth(i).innerText()+"-------"+values.nth(i).getAttribute("lang"));
        /*List<ElementHandle> values = page.querySelectorAll("select > option");

        System.out.println(values.size());


        for(ElementHandle value: values) {

            System.out.println(value.innerText()+"----"+value.getAttribute("lang"));*/


        }

        //page.close();
		//playwright.close();

    }



}
