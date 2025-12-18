public class MathUtils {

    public static String[] fizzBuzz(int range, int divider1, int divider2, String divider1Word, String divider2Word) {
        String[] fizzBuzzArray = new String[range];
        for (int i = 1; i <= range; i++) {
            if (i % divider1 == 0 && i % divider2 == 0) {
                fizzBuzzArray[i-1] = divider1Word + divider2Word;
            } else if (i % divider1 == 0) {
                fizzBuzzArray[i-1] = divider1Word;
            } else if (i % divider2 == 0) {
                fizzBuzzArray[i-1] = divider2Word;
            } else {
                fizzBuzzArray[i-1] = String.valueOf(i);
            }
        }
        return fizzBuzzArray;
    }

    public static int sumEvens(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (currentNumber % 2 == 0) {
                sum = sum + currentNumber;
            }
        }
        return sum;
    }

    public static int findMin(int... arr) {
        int lowestNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            if (lowestNumber > currentNumber) {
                lowestNumber = currentNumber;
            }
        }
        return lowestNumber;
    }
}