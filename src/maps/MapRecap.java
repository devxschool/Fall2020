package maps;

import java.util.HashMap;
import java.util.Map;

public class MapRecap {


    public static void main(String[] args) {
        //key -> id
        //value -> student names
        Map<Integer, String>  map = new HashMap<>();

        //add a new pair if it doesnt exit
        map.put(100, "John Doe");
        map.put(200, "Elon Musk");
        System.out.println(map);

        //100 -> Steve Jobs?
        map.put(100, "Steve Jobs");
        map.put(120, "Mark ");
        System.out.println(map);

        //write a logic to update id 120 to point to
        //"Melinda Gates" if 120 exists if it doesnt
        //dont do anything.

        //map.isEmpty();//false when

        map.replace(120, "Melinda Gates");
//        if (map.containsKey(120)){
//            map.put(120, "Melinda Gates");
//        }
        System.out.println(map);
    }



}
