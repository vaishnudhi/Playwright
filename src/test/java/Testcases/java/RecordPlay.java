package Testcases.java;
import com.microsoft.playwright.*;
        import com.microsoft.playwright.options.*;
        import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
        import java.util.*;

public class RecordPlay{
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://demo.playwright.dev/todomvc/");
            page.navigate("https://demo.playwright.dev/todomvc/#/");
            Page page1 = context.newPage();
            page1.navigate("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AdF4I76c6NuDKnOP_m_YtObbZ7Qx57SVZumGsRZ6TGYxA2_f6n9eqkar_nzRwIStiDZ_H2GBN7Eu7Q&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-804365098%3A1723110283622923&ddm=0");
            page1.getByLabel("Email or phone").fill("trainer@way2automation.com");
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
            page1.getByLabel("Enter your password").fill("hariyshbkxmg");
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
            page1.getByText("Wrong password. Try again or").click();
            page1.getByLabel("Enter your password").click();
            page1.getByLabel("Enter your password").fill("hgaxdsjkgfdsb");
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Forgot password?")).click();
            page1.close();
        }
    }
}


