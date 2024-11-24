
package Testcases.java;

        import com.microsoft.playwright.*;

public class ReSizeElements {
    public static void main(String[] args) throws InterruptedException {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://jqueryui.com/resources/demos/resizable/default.html");
        Locator slider = page.locator("//*[@id=\"resizable\"]");
        Thread.sleep(2000);
        page.mouse().move(slider.boundingBox().x + slider.boundingBox().width / 2, slider.boundingBox().y + slider.boundingBox().height / 2);
        page.mouse().down();
        page.mouse().move(slider.boundingBox().x + 400, slider.boundingBox().y+400);

        page.mouse().up();

    }
}
