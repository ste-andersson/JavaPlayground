public class Loops {
    public static void main(String[] args) {
        System.out.println("The duplicate is:");
        int numbers[] = {10, 50, 30, 50, 20};
        System.out.println(findDuplicate(numbers));
    }

    public static int findDuplicate(int input[]) {
        int duplicateNumber = 0;
        int checkNumber = 0;
        for (int i = 0; i < input.length; i++) {
            checkNumber = input[i];
            for (int j = 0; j < input.length; j++) {
                if (checkNumber == input[j] && i != j) {
                        duplicateNumber = checkNumber;
                }
            }
        }
        return duplicateNumber;
    }
}
