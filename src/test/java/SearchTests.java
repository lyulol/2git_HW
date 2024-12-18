import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        WebDriverRunner.getWebDriver().manage().addCookie(new Cookie("SOCS", "CAESHAgBEhJnd3NfMjAyNDExMTQtMF9SQzEaAmVuIAEaBgiAqu"));
        refresh();
        $("[name=q]").setValue("github").pressEnter();
        $("[id=search]").shouldHave(text("https://github.com"));
    }

}
