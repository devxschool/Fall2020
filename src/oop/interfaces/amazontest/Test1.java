package oop.interfaces.amazontest;

import oop.interfaces.BrowserService;
import oop.interfaces.Chrome;
import oop.interfaces.Safari;

//Dynamic Test framework which is able to run against different browsers
//different environments.

public class Test1 {
    public static void main(String[] args) {

        //application arguments.
        //0 -> from browser type
        //1 -> env
        //2 -> password

        //open the given browser
        //and navigate the browser to the given environment url.

        BrowserService browser = null;
        switch (args[0].toLowerCase()) {
            case "chrome":
                browser = new Chrome();
                break;
            case "safari":
                browser = new Safari();
                break;
            default:
                System.err.println("Unsupported browser");
                System.exit(1);
        }

        System.out.println("Opened " + args[0]);
        //polymorphism is an ability to take different shapes
        //in Java interface data types can be initialized with Objects that implement the interface.
        //and this a runtime process. Dynamic binding.
        browser.navigate(args[1]);
        System.out.println(args[0] + " navigated to " + args[1]);
        getUrl(browser);
    }


    public static String getUrl(BrowserService browser){
        return browser.getUrl();
    }
}
