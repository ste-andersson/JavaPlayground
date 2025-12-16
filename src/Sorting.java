public class Sorting {

    public static void main(String[] args) {
        int[] ordning = {1, 2, 5, 8, 10};
        int[] oordning = {1, 5, 3, 9, 2};

        System.out.println("Är första listan sorterad? " + isSorted(ordning));
        System.out.println("Är andra listan sorterad? " + isSorted(oordning));
    }

    // DIN METOD HÄR
    public static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i<arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }

}
