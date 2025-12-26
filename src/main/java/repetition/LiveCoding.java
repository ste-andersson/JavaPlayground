package repetition;

public class LiveCoding {

    public static void main(String[] args) {
        int testRange = 40;
        int testDivider1 = 3;
        int testDivider2 = 4;
        String testWord1 = "Hey";
        String testWord2 = "Ho";
        String[] testResult = fizzBuzzTest(testRange, testDivider1, testDivider2, testWord1, testWord2);
        for (int i = 1; i <= testRange; i++) {
            System.out.println(testResult[i-1]);
        }
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
}
