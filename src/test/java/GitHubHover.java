import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubHover {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void gitHubHoverTest() {
        open("https://github.com/");
        $(".header-logged-out").$(byText("Solutions")).hover();
        $("[href='https://github.com/enterprise']").click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }
}
