
import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class WebTest {

    @Test
    public void test() throws InterruptedException {
        open("https://www.wikipedia.org/");
        $x("//input[@name='search']").setValue("Tesla").pressEnter();
        $x("//a[@href='/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0']").shouldBe(Condition.visible);
        $x("//span[@class='mw-headline']").shouldBe(Condition.visible);
        $x("//p").shouldBe(Condition.visible);
        $x("//a[@lang='en']").click();
        Thread.sleep(5000);

    }

}
