import java.util.Scanner;

public class Testing {

        public static void main(String[] args) {
            // Loop five rows
            for (int i = 0; i < 5; i++) {
                int row = i + 1;
                System.out.println("Rad: " + row);
            }

            // Get a word from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write a word that you want backwards: ");
            String inputWord = scanner.nextLine();

            // Write a word backwards
            System.out.println("\"" + inputWord + "\" backwards is \"" + wordBackwards(inputWord) + "\"");

            // FizzBuzz
            fizzBuzz(100, 3, 5, "Fizz", "Buzz");
        }

        public static String wordBackwards(String text) {
            String textBackwards = "";
            for (int i = (text.length() - 1); i>=0; i--) {
                textBackwards = textBackwards + text.charAt(i);
            }
            return textBackwards;
        }

        public static void fizzBuzz(int range, int divider1, int divider2, String divider1Word, String divider2Word) {
            for (int i = 1; i <= range; i++) {
                if (i % divider1 == 0 && i % divider2 == 0) {
                    System.out.println(divider1Word + divider2Word);
                } else if (i % divider1 == 0) {
                    System.out.println(divider1Word);
                } else if (i % divider2 == 0) {
                    System.out.println(divider2Word);
                } else {
                    System.out.println(i);
                }
            }
        }
    }
