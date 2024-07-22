import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        int k = 2;
        int[] rotatedArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = array[i];
        }
        
        System.out.println("Array after rotating right: " + Arrays.toString(rotatedArray));
    }
}
