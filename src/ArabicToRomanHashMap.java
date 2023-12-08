import java.util.LinkedHashMap;
import java.util.Map;

/** ARABIC NUMERALS TO ROMAN NUMERALS CONVERTER USING HASHMAP */

public class ArabicToRomanHashMap {
    private static final Map<Integer, String> romanMap = new LinkedHashMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};
    public String arabicToRoman(int num) {

        if (num <= 0 || num > 3999) return "Incorrect input";

        StringBuilder resultSstring = new StringBuilder();

        for (Map.Entry<Integer, String> roadmap : romanMap.entrySet()) {
            Integer decimalKey = roadmap.getKey();
            String value = roadmap.getValue();
            while (num >= decimalKey) {
                resultSstring.append(value);
                num -= decimalKey;
            }
        }

        return resultSstring.toString();
    }
}
