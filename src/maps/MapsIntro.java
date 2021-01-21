package maps;

import java.util.HashMap;
import java.util.Map;

public class MapsIntro {

    /**
     * Lets store error codes and their descriptions.
     *
     * @param args
     */
    public static void main(String[] args) {
        //unlike List and Sets we have to provide
        //two data types in the <>.
        //first one for the data type of keys
        //second one for the data type of the values
        //Keys and values can only be Objects.
        //so consider using WrapperClasses.
        Map<Integer, String> httpStatusCodes = new HashMap<>();
        httpStatusCodes.put(100, "An interim response. Indicates the client that the initial part of the request has been received and has not yet been rejected by the server. The client SHOULD continue by sending the remainder of the request or, if the request has already been completed, ignore this response. The server MUST send a final response after the request has been completed.");
        httpStatusCodes.put(201, "Indicates that request has succeeded and a new resource has been created as a result.");
        httpStatusCodes.put(300, "The request has more than one possible response. The user-agent or user should choose one of them.");
        httpStatusCodes.put(404, "The server can not find the requested resource.");
        httpStatusCodes.put(500, "The server encountered an unexpected condition which prevented it from fulfilling the request.");
        httpStatusCodes.put(202, null);
        httpStatusCodes.put(null, "It's a bug");
        System.out.println(httpStatusCodes);


        System.out.println(httpStatusCodes.get(300));
        System.out.println(httpStatusCodes.get(404));
        System.out.println(httpStatusCodes.get(401));


        //write a logic which would tell me what the status code 201 means
        //if the given status code doesnt exist tell me to choose
        //a different status code.

        if (httpStatusCodes.get(201) == null) {
            System.out.println("Given Status code doesnt exist");
        } else {
            System.out.println(httpStatusCodes.get(201));
        }

        System.out.println(httpStatusCodes.get(null));
        System.out.println(httpStatusCodes.get(202));

        httpStatusCodes.put(202, "Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing.");

        System.out.println(httpStatusCodes.get(202));
    }
}
