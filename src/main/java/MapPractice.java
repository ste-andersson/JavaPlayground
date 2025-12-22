import java.util.HashMap;
import java.util.ArrayList;

public class MapPractice {

    public static void main(String[] args) {

        ArrayList<String> input = new ArrayList<>();

        input.add("katt");
        input.add("hund");
        input.add("katt");
        input.add("fågel");
        input.add("katt");

        HashMap<String, Integer> resultMap = countWords(input);

        System.out.println("The list: " + input);
        System.out.println("The counting: " + resultMap);

    }

    public static HashMap<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();

        for (String word : list) {
            if (result.containsKey(word)) {
                Integer newNumber = result.get(word) + 1;
                result.put(word, newNumber);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }
}
