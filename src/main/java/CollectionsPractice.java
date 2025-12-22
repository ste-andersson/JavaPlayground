import java.util.ArrayList;

public class CollectionsPractice {

    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(5);
        inputList.add(3);
        inputList.add(8);
        inputList.add(7);

        System.out.println("Original: " + inputList);
        ArrayList<Integer> oddNumbers = filterOddNumbers(inputList);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    public static ArrayList<Integer> filterOddNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;
    }
}
