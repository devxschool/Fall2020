package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesMethod {

    public static void main(String[] args) {
        Map<Integer, String> httpStatusCodes = new HashMap<>();
        httpStatusCodes.put(100, "An interim response. Indicates the client that the initial part of the request has been received and has not yet been rejected by the server. The client SHOULD continue by sending the remainder of the request or, if the request has already been completed, ignore this response. The server MUST send a final response after the request has been completed.");
        httpStatusCodes.put(201, "Indicates that request has succeeded and a new resource has been created as a result.");
        httpStatusCodes.put(300, "The request has more than one possible response. The user-agent or user should choose one of them.");
        httpStatusCodes.put(404, "The server can not find the requested resource.");
        httpStatusCodes.put(500, "The server encountered an unexpected condition which prevented it from fulfilling the request.");
        httpStatusCodes.put(202, null);


        //this is not a common practice.
        //since we dont have a track of the key
        //we cannot update the value for the key.
        //if you were validating a format of the value
        //and then wanted report the keys of any invalid formatted values
        //you would not be able accomplish that.

        Collection<String> allOfTheValues = httpStatusCodes.values();
        for (String value : allOfTheValues) {
            System.out.println(value);
        }
    }
}
