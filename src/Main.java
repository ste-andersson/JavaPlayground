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
    }
}