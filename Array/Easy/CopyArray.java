import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}
