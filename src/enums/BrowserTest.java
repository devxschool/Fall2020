package enums;

import oop.interfaces.BrowserService;

public class BrowserTest {

    public static void main(String[] args) {
        try {
            BrowserService browser = Browser.getDriver(Browsers.SAFARI);
            browser.getUrl();
            browser.navigate("qa-chase.com");
            browser.playVideo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}