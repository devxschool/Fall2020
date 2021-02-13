package methods.testclasses;

import java.util.HashMap;
import java.util.Map;

public class AppStore {

    public static Map<String, Integer> store = new HashMap<>();


    public static String buy(String device, int count) {
        if (store.containsKey(device)) {
            if (store.get(device) >= count) {
                store.put(device, store.get(device) - count);
                return "Success";
            }
            else {
                return "Not enough " + device;
            }
        }

        else {
            return "Out of " + device;
        }

    }

}
