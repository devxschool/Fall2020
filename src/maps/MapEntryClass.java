package maps;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryClass {

    public static void main(String[] args) {
        //Entry is a class that represents
        //one Entry(key value pair) in a map
        //ex:

        Map.Entry<Integer, String> oneEntry  = new AbstractMap.SimpleEntry<Integer, String>(120, "John Doe");
        System.out.println(oneEntry.getKey());
        System.out.println(oneEntry.getValue());



        Map<Integer, String> httpStatusCodes = new HashMap<>();
        httpStatusCodes.put(100, "An interim response. Indicates the client that the initial part of the request has been received and has not yet been rejected by the server. The client SHOULD continue by sending the remainder of the request or, if the request has already been completed, ignore this response. The server MUST send a final response after the request has been completed.");
        httpStatusCodes.put(201, "Indicates that request has succeeded and a new resource has been created as a result.");
        httpStatusCodes.put(300, "The request has more than one possible response. The user-agent or user should choose one of them.");
        httpStatusCodes.put(404, "The server can not find the requested resource.");
        httpStatusCodes.put(500, "The server encountered an unexpected condition which prevented it from fulfilling the request.");
        httpStatusCodes.put(202, null);

        Set<Map.Entry<Integer,String>> allOfTheEntries = httpStatusCodes.entrySet();
        //List<DataType of all of the Element>
        //Set<DataType for all of the Elements>

        //check if any of the keys are pointing to null.
        //update the null values to "I am not null any more"

        //
        for (Map.Entry<Integer,String> entry : allOfTheEntries) {
            if (entry.getValue() == null) {
                httpStatusCodes.put(entry.getKey(), "I am not null anymore");
            }
        }

        System.out.println(httpStatusCodes);
    }
}
