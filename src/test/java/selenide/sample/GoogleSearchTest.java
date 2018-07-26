package selenide.sample;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {
  @Test
  public void userCanSearchAnyKeyword() {

    Configuration.remote="http://localhost:4444/wd/hub";
    Configuration.browser="chrome";

    open("http://google.com/en");
    $(By.name("q")).val("selenide").pressEnter();
    $$("#ires .g").shouldHave(size(10));
    $("#ires .g").shouldHave(text("selenide.org"));
  }
}