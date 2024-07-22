import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        int n = array.length;
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex++] = array[i];
            }
        }

        while (nonZeroIndex < n) {
            array[nonZeroIndex++] = 0;
        }

        System.out.println("Array after moving zeroes: " + Arrays.toString(array));
    }
}
