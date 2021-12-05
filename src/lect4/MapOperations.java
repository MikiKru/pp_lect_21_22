package lect4;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        Map<String, Integer> romanToArabicConv = new HashMap<>();
        romanToArabicConv.put("I", 1);
        romanToArabicConv.put("II", 2);
        romanToArabicConv.put("III", 3);
        romanToArabicConv.put("IV", 4);
        romanToArabicConv.put("V", 5);
        System.out.println(romanToArabicConv);
        for (String key : romanToArabicConv.keySet()){
            System.out.println(key + " : " + romanToArabicConv.get(key));
        }
        // usuwanie pary k-v
        romanToArabicConv.remove("I");
        System.out.println(romanToArabicConv);
    }
}
