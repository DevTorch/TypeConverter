/** ARABIC NUMERALS TO ROMAN NUMERALS CONVERTER USING RECURSION */
public class ArabicToRomanRecursion {
    private String concat = "";

    public String arabicToRoman(int num) {
        if (num <= 0 || num > 3999) return "Incorrect input.";

        if (num >= 1000) {
            concat += "M";
            arabicToRoman(num - 1000);
        } else
        if (num >= 500) {
            if (num >= 900) {
                concat += "CM";
                arabicToRoman(num - 900);
            } else {
                concat += "D";
                arabicToRoman(num - 500);
            }
        } else
        if (num >= 100) {
            if (num >= 400) {
                concat += "CD";
                arabicToRoman(num - 400);
            } else {
                concat += "C";
                arabicToRoman(num - 100);
            }
        } else
        if (num >= 50) {
            if (num >= 90) {
                concat += "XC";
                arabicToRoman(num - 90);
            } else {
                concat += "L";
                arabicToRoman(num - 50);
            }
        } else
        if (num >= 10) {
            if (num >= 40) {
                concat += "XL";
                return arabicToRoman(num - 40);
            } else {
                concat += "X";
                arabicToRoman(num - 10);
            }
        } else
        if (num >= 5) {
            if (num == 9) {
                concat += "IX";
            } else {
                concat += "V";
                arabicToRoman(num - 5);
            }
        } else
        if (num > 0) {
            if (num == 4) {
                concat += "IV";
            } else {
                concat = concat + "I";
                arabicToRoman(num - 1);
            }
        }
        return concat;
    }
}
