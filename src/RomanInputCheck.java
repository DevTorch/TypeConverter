import java.util.LinkedHashMap;
import java.util.Map;

public class RomanInputCheck {

/*
цифры V, L, D не могут повторяться; цифры I, X, C, M могут повторяться не более трех раз подряд:
*/
    private int inRow = 0;
    private int total = 0;
    private char current_char;
    private char prev_char = ' ';
    private Map<Character, Integer> total_map = new LinkedHashMap<>() {{
        put('I', 4);
        put('V', 1);
        put('X', 4);
        put('L', 1);
        put('C', 4);
        put('D', 1);
        put('M', 4);
    }};
    private Map<Character, Integer> inRow_map = new LinkedHashMap<>() {{
        put('I', 3);
        put('V', 1);
        put('X', 3);
        put('L', 1);
        put('C', 3);
        put('D', 1);
        put('M', 3);
    }};
    private Map<Character, Integer> checked_map = new LinkedHashMap<>() {{
        put('I', 0);
        put('V', 0);
        put('X', 0);
        put('L', 0);
        put('C', 0);
        put('D', 0);
        put('M', 0);
    }};
    private String incoming_string;

    public RomanInputCheck(String incoming_string) {
        this.incoming_string = incoming_string;
    }
    public boolean check(){
        char[] chars = incoming_string.toCharArray();

        for (int i = 0; i < chars.length; i++){
            current_char = chars[i];

            if (current_char != prev_char) inRow = 0;
            if (total_map.containsKey(current_char)){
                total = checked_map.get(current_char);
                inRow++;

                if (inRow > inRow_map.get(current_char)) return false;

                total++;
                checked_map.put(current_char, total);
                prev_char = current_char;

            } else return false;
            for (Character current_char: chars) {
                if (checked_map.get(current_char) > total_map.get(current_char))
                    return false;
            }
        }
        System.out.println(checked_map);
        return true;
    }
}
