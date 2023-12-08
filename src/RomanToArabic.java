import java.util.LinkedHashMap;
import java.util.Map;

/** ROMAN NUMERALS TO ARABIC NUMERALS CONVERTER */
public class RomanToArabic {
    static boolean check(String string) {
        return string.matches("^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
        //return new RomanInputCheck(string).check();
    }

    public int romanToArabic(String s) {

        String inputString = s.toUpperCase();

        Map<Character, Integer> table = new LinkedHashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int sum;
        if (check(inputString)) {

            int stringPosition = inputString.length() - 1;
            sum = table.get(inputString.charAt(stringPosition));
            int last = table.get(inputString.charAt(stringPosition));

            for (int i = stringPosition - 1; i >= 0; i--) {
                int current = table.get(inputString.charAt(i));
                if (current < last) {
                    sum -= current;
                } else {
                    sum += current;
                }
                last = current;
            }

        } else {
            System.out.println("Incorrect Input");
            return 0;
        }
        if (sum > 3999) return 0;
        return sum;
    }
}