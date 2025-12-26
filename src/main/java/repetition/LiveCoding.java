package repetition;

public class LiveCoding {

    public static void main(String[] args) {
        //Add values for FizzBuzz-test
        int testRange = 40;
        int testDivider1 = 3;
        int testDivider2 = 4;
        String testWord1 = "Hey";
        String testWord2 = "Ho";

        //Create the array
        String[] testResult = fizzBuzzTest(testRange, testDivider1, testDivider2, testWord1, testWord2);

        //Loop out the array
        for (int i = 1; i <= testRange; i++) {
            System.out.println(testResult[i-1]);
        }

        String testWordTrue = "apa";
        String testWordFalse = "apan";

        System.out.println(isPalindrome(testWordFalse));


    }

    public static String[] fizzBuzzTest(int range, int divider1, int divider2, String word1, String word2) {
        String[] result = new String[range];
        for (int i = 1; i <= range; i++) {
            if (i % divider1 == 0 && i % divider2 == 0) {
                result[i-1] = word1 + word2;
            } else if (i % divider1 == 0) {
                result[i-1] = word1;
            } else if (i % divider2 == 0) {
                result[i-1] = word2;
            } else {
                result[i-1] = String.valueOf(i);
            }
        }
        return result;
    }

    public static boolean isPalindrome(String palindromeWord) {
        String word = palindromeWord;
        String wordBackwards = "";
        for (int i = word.length(); i > 0; i--) {
            wordBackwards = wordBackwards + word.charAt(i-1);
            }
        if (word.equals(wordBackwards)) {
            return true;
        } else {
            return false;
        }
    }



}
