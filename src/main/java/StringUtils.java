public class StringUtils {

    public static String reverseString(String text) {
        String textReversed = "";
        for (int i = (text.length() - 1); i >= 0; i--) {
            textReversed = textReversed + text.charAt(i);
        }
        return textReversed;
    }

    public static int letterFrequency(String text, char letter) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int countLetter(String text, char letterToFind) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char letterChecked = text.charAt(i);
            if (letterChecked == letterToFind || letterChecked == Character.toUpperCase(letterToFind)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String text) {
        if (text == null) return false;
        String reversed = reverseString(text);
        return text.equalsIgnoreCase(reversed);
    }
}