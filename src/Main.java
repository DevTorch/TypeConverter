public class Main {
    public static void main(String[] args) {
        //ѕереводим римские в арабские
        RomanToArabic roman = new RomanToArabic();
        System.out.println(roman.romanToArabic("MMMCMXCIX"));

        //ѕереводим арабские в римские с использованием массивов
        ArabicToRomanUsingArray arabic_array = new ArabicToRomanUsingArray();
        System.out.println(arabic_array.arabicToRoman(3999));
        //ѕереводим арабские в римские с использованием рекурсии
        ArabicToRomanRecursion arabic_recursion = new ArabicToRomanRecursion();
        System.out.println(arabic_recursion.arabicToRoman(3999));
        //ѕереводим арабские в римские с использованием LinkedHashMap
        ArabicToRomanHashMap arabic_hashmap = new ArabicToRomanHashMap();
        System.out.println(arabic_hashmap.arabicToRoman(3999));

        System.out.println("-----!!TRIPLE PLAY!!-----");
        System.out.println(arabic_hashmap.arabicToRoman(roman.romanToArabic(arabic_array.arabicToRoman(3999))));
    }
}