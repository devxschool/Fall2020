package enums;

import oop.interfaces.BrowserService;
import oop.interfaces.Chrome;
import oop.interfaces.Safari;

public class Browser {

    public static BrowserService getDriver(Browsers browser) throws Exception {

        switch (browser) {
            case CHROME:
                return new Chrome();
            case SAFARI:
               return new Safari();
            default:
                throw new Exception("Unsupported Browser");
        }
    }
}
