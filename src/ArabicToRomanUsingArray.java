/** ARABIC NUMERALS TO ROMAN NUMERALS CONVERTER USING AN ARRAYS TO MATCH */

public class ArabicToRomanUsingArray {
    private final static String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private final static int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String arabicToRoman(int num){
        if (num <= 0 || num > 3999) return "Incorrect input";

        StringBuilder resultString = new StringBuilder();
        int remaining = num;
        for (int i = 0; i < roman.length; i++) {
            int decimalValue = numbers[i];
            String romanNumeral = roman[i];
            while (remaining >= decimalValue) {
                resultString.append(romanNumeral);
                remaining -= decimalValue;
            }
        }
        return resultString.toString();
    }
}