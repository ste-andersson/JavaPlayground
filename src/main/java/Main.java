import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Text block för menyn
        String welcomeMessage = """
                ================================
                |   STEFAN'S JAVA PLAYGROUND   |
                ================================
                1. Check if a word is a Palindrome
                2. Count 'e' in a word
                3. Run FizzBuzz (1-15)
                0. Exit
                
                Your choice: """;

        System.out.print(welcomeMessage);
        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> {
                System.out.print("Enter a word: ");
                String word = scanner.nextLine();
                boolean result = StringUtils.isPalindrome(word);
                System.out.print("Is " + word + " a palindrome? ");
                if (result == true) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            case "2" -> {
                System.out.print("Enter text: ");
                String text = scanner.nextLine();
                char searchLetter = '0';
                while (true) {
                    System.out.print("Enter a letter: ");
                    String inputLetter = scanner.nextLine();
                    if (inputLetter.length() == 1) {
                        searchLetter = inputLetter.toLowerCase().charAt(0);
                        break;
                    }
                }
                int count = StringUtils.countLetter(text, searchLetter);
                System.out.println("Found '" + searchLetter + "' " + count + " times in " + text + ".");
            }
            case "3" -> {
                String[] fb = MathUtils.fizzBuzz(15, 3, 5, "Fizz", "Buzz");
                for (String s : fb) System.out.print(s + " ");
                System.out.println(); // Ny rad
            }
            case "0" -> System.out.println("Bye!");
            default -> System.out.println("Invalid choice.");
        }
    }
}