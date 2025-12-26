package repetition;

import java.util.Arrays;

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

        int[] inputNumbers = {5, 6, 7, 1, 10, 55};

        System.out.println(secondMax(inputNumbers));

        //Create arrays for merging
        int[] arrayForMerging1 = {1, 5, 7, 11, 19};
        int[] arrayForMerging2 = {2, 3, 4, 11, 17, 18, 19, 25, 26};

        System.out.println(Arrays.toString(mergeArrays(arrayForMerging1, arrayForMerging2)));


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

    public static int secondMax(int[] input) {
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < input.length ; i++) {
            if (input[i] > max) {
                secondMax = max;
                max = input[i];
            } else if (input[i] > secondMax) {
                secondMax = input[i];
            }
        }
        return secondMax;
    }

    public static int[] mergeArrays(int[] input1, int[] input2) {
        int[] inputLonger = input1;
        int[] inputShorter = input2;
        int[] result = new int[input1.length + input2.length];
        if (input1.length < input2.length){
            inputLonger = input2;
            inputShorter = input1;
        }
        int inputShorterIndex = 0;
        int resultIndex = 0;
        for (int i = 0; i < inputLonger.length; i++) {
            for (int j = inputShorterIndex; j < inputShorter.length && inputShorter[j] <= inputLonger[i]; j++) {
                result[resultIndex] = inputShorter[inputShorterIndex];
                resultIndex++;
                inputShorterIndex++;
            }
            result[resultIndex] = inputLonger[i];
            resultIndex++;
        }
        return result;
    }



}
