package com.browserstack;

import io.appium.java_client.AppiumBy;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class HomeTest extends BrowserStackJUnitTest{
        @Test
        public void sampleTest() throws Exception{
            WebElement webElement = (WebElement) driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.Button[2]"));
            webElement.click();
            WebElement closeButton = (WebElement) driver.findElement(AppiumBy.id("com.anydog.t2m.test:id/btnSubmit"));
            closeButton.isDisplayed();
            closeButton.click();
        }
}

