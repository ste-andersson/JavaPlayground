import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        //Receive input from user through Scanner
        System.out.print("Skriv något: ");
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.nextLine();
        System.out.println("Du skrev: " + inputMessage);
        //Display input in upper case
        String inputUpperCase = inputMessage.toUpperCase();
        System.out.println("Med versaler blir det: " + inputUpperCase);
        //Print only first word
        System.out.println("Första ordet är:");
        if(inputMessage.indexOf(" ") != -1) {
            System.out.println(inputMessage.substring(0, inputMessage.indexOf(" ")));}
        else {
                System.out.println(inputMessage);
            }
        //Receive one character input
        char searchLetter = 'a';
        while (true) {
            System.out.println("Vilken bokstav ska räknas?");
            String inputLetter = scanner.nextLine();

            if (inputLetter.length() == 1) {
                searchLetter = inputLetter.charAt(0);
                break;
            }
            System.out.println("Du skrev " + inputLetter + " vilket innehåller " + inputLetter.length() + " bokstäver. Skriv bara en bokstav!");
        }
        System.out.println("Du valde " + Character.toUpperCase(searchLetter));
        //Count occurances of chosen letter in input message
        System.out.println("Vald bokstav förekommer " + letterFrequence(inputMessage, searchLetter) + " gånger");
        scanner.close();
    }

    public static int letterFrequence(String text, char letter) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                sum = sum + 1;
            }
        }
        return sum;
    }


}
