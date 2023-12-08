public class Main {
    public static void main(String[] args) {
        //��������� ������� � ��������
        RomanToArabic roman = new RomanToArabic();
        System.out.println(roman.romanToArabic("MMMCMXCIX"));

        //��������� �������� � ������� � �������������� ��������
        ArabicToRomanUsingArray arabic_array = new ArabicToRomanUsingArray();
        System.out.println(arabic_array.arabicToRoman(3999));
        //��������� �������� � ������� � �������������� ��������
        ArabicToRomanRecursion arabic_recursion = new ArabicToRomanRecursion();
        System.out.println(arabic_recursion.arabicToRoman(3999));
        //��������� �������� � ������� � �������������� LinkedHashMap
        ArabicToRomanHashMap arabic_hashmap = new ArabicToRomanHashMap();
        System.out.println(arabic_hashmap.arabicToRoman(3999));

        System.out.println("-----!!TRIPLE PLAY!!-----");
        System.out.println(arabic_hashmap.arabicToRoman(roman.romanToArabic(arabic_array.arabicToRoman(3999))));
    }
}