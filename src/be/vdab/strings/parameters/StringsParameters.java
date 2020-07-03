package be.vdab.strings.parameters;

public class StringsParameters {
    public static boolean isPalindrome(String string) {
        StringBuilder newString = new StringBuilder();
        string = string.toLowerCase();
        for (int i = string.length() - 1; i >= 0; i--) {
            newString.append(string.charAt(i));
        }
        System.out.print(newString + " , ");
        return newString.toString().equals(string);
    }

    public static boolean isPhrasePalindrome(String string) {
        string = string.replaceAll(" ", "");
        StringBuilder newString = new StringBuilder();
        string = string.toLowerCase();
        for (int i = string.length() - 1; i >= 0; i--) {
            newString.append(string.charAt(i));
        }
        System.out.print(newString + " , ");
        return newString.toString().equals(string);
    }

    public static boolean isUrl(String string) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            newString.append(string.charAt(i));
        }
        System.out.print(newString + " , ");
        return newString.toString().equals("http://");
    }

    public static int isVowel(String string) {
        int vowelCount = 0;
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    vowelCount++;
                    System.out.print(string.charAt(i) + ", ");
                    break;
            }
        }
        return vowelCount;
    }
}
