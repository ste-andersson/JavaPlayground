public class Main {

    public static void main(String[] args){
        //print a string message
        String message = "Hallå där!";
        System.out.println(message);
        //print the same thing but upper case
        String messageUpperCase = message.toUpperCase();
        System.out.println(messageUpperCase);
        //print the first word
        if (message.indexOf(" ") != -1) {
           String firstWord = message.substring(0, message.indexOf(" "));
           System.out.println(firstWord);
        } else {
           String firstWord = message;
           System.out.println(firstWord);
        }
        //Count occurances of a letter
        char letter = 'a';
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            char letterChecked = message.charAt(i);
            if (letterChecked == letter || letterChecked == Character.toUpperCase(letter)) {
                count++;
            }
        }
        System.out.println("Det finns " + count + " stycken " + letter + " i texten.");
        //Count occurances of a letter using a method
        System.out.println("Antal a: " + countLetter(message, 'a'));
        System.out.println("Antal l: " + countLetter(message, 'l'));
        //Modulo test
        int[] myNumbers = {1, 2, 3, 4, 5, 6, 10};
        int evenSum = sumEvens(myNumbers);
        System.out.println("Summan av alla jämna tal är: " + evenSum);
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

    public static int sumEvens(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (currentNumber % 2 == 0) {
                sum = sum + currentNumber;
            }
        }
        return sum;
    }
}