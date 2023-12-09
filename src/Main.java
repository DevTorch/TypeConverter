public class Main {
    public static void main(String[] args) {
        //Converting Roman numerals into Arabic
        RomanToArabic roman = new RomanToArabic();
        System.out.println(roman.romanToArabic("MMMCMXCIX"));

        //Converting Arabic numerals to Roman using arrays
        ArabicToRomanUsingArray arabic_array = new ArabicToRomanUsingArray();
        System.out.println(arabic_array.arabicToRoman(3999));
        //Converting Arabic numerals to Roman using recursion
        ArabicToRomanRecursion arabic_recursion = new ArabicToRomanRecursion();
        System.out.println(arabic_recursion.arabicToRoman(3999));
        //Converting Arabic numerals to Roman using LinkedHashMap
        ArabicToRomanHashMap arabic_hashmap = new ArabicToRomanHashMap();
        System.out.println(arabic_hashmap.arabicToRoman(3999));

        System.out.println("-----!!TRIPLE PLAY!!-----");
        System.out.println(arabic_hashmap.arabicToRoman(roman.romanToArabic(arabic_array.arabicToRoman(3999))));
    }
}