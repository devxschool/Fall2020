package maps;

import java.util.HashMap;
import java.util.Map;

public class CharOccurances {
    public static void main(String[] args) {

        //"xxxxxxxxxx"
        String word = "Helllllllo World";
        Map<Character, Integer> occurencces = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!occurencces.containsKey(word.charAt(i))) {
                occurencces.put(word.charAt(i), 1);
            } else {
                int lastOccuranceNum = occurencces.get(word.charAt(i));
                occurencces.put(word.charAt(i), lastOccuranceNum + 1);
            }
//            if(word.charAt(i)==''){
//                counter++;
//            }
        }
        System.out.println(counter);
        System.out.println(occurencces);

    }
}
