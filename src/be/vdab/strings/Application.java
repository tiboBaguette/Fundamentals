package be.vdab.strings;

import be.vdab.strings.parameters.StringsParameters;

public class Application {
    public static void main(String[] args) {
        String string1 = "Lepel";
        String string2 = "http://www.smartdeveloper.be/";
        String string3 = "De mooie zeeman nam Anna mee zei oom Ed";

        int vowelCount = StringsParameters.isVowel(string1);
        System.out.println("string1 has " + vowelCount + " vowels");
        vowelCount = StringsParameters.isVowel(string2);
        System.out.println("string2 has " + vowelCount + " vowels");
        vowelCount = StringsParameters.isVowel(string3);
        System.out.println("string3 has " + vowelCount + " vowels");

        boolean isPalindrome = StringsParameters.isPalindrome(string1);
        System.out.println(isPalindrome);

        boolean isPhrasePalindrome = StringsParameters.isPhrasePalindrome(string3);
        System.out.println(isPhrasePalindrome);

        boolean isUrl = StringsParameters.isUrl(string2);
        System.out.println(isUrl);



    }
}
