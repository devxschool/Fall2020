package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapLoops {

    public static void main(String[] args) {
        //That's not a bug that's a feature
        Map<Integer, String> httpStatusCodes = new HashMap<>();
        httpStatusCodes.put(100, "An interim response. Indicates the client that the initial part of the request has been received and has not yet been rejected by the server. The client SHOULD continue by sending the remainder of the request or, if the request has already been completed, ignore this response. The server MUST send a final response after the request has been completed.");
        httpStatusCodes.put(201, "Indicates that request has succeeded and a new resource has been created as a result.");
        httpStatusCodes.put(300, "The request has more than one possible response. The user-agent or user should choose one of them.");
        httpStatusCodes.put(404, "The server can not find the requested resource.");
        httpStatusCodes.put(500, "The server encountered an unexpected condition which prevented it from fulfilling the request.");
        httpStatusCodes.put(202, null);

        //httpStatusCodes.get(205);

        Set<Integer> allOfTheKeys = httpStatusCodes.keySet();
        //check if any of the keys are pointing to null.
        //update the null values to "I am not null any more"
        for (Integer key : allOfTheKeys) {
            httpStatusCodes.putIfAbsent(key, "I am not null anymore");
//            if (httpStatusCodes.get(key) == null){
//                httpStatusCodes.put(key, "I am not null anymore");
//            }
            System.out.println(httpStatusCodes.get(key));
        }














    }
}
