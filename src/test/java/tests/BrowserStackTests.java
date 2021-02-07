package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static io.appium.java_client.MobileBy.*;

public class BrowserStackTests extends TestBase {

    @Test
    @DisplayName("Sample test on android platform")
    @Tag("android")
    void searchAndroidTest() {
        open();
        $(AccessibilityId("Search Wikipedia")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        $$(className("android.widget.TextView")).shouldBe(CollectionCondition.sizeGreaterThan(0));
    }

    @Test
    @DisplayName("Sample test on ios platform")
    @Tag("ios")
    void searchIOSTest() {
        open();
        $(AccessibilityId("Text Button")).click();
        $(AccessibilityId("Text Input")).setValue("hello@browserstack.com").pressEnter();
        $(AccessibilityId("Text Output")).shouldHave(text("hello@browserstack.com"));
    }
}