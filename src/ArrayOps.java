public class ArrayOps {

    // Summera tal i en lista
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Hitta största talet (Din pågående övning)
    public static int findMax(int[] arr) {
        int maxVal = arr[0];

        // Loopa från index 1 (andra talet) till slutet
        for (int i = 1; i < arr.length; i++) {
        }
        return maxVal;
    }
}