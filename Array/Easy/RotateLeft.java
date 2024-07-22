import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        int k = 2; 
        int[] rotatedArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotatedArray[i] = array[(i + k) % n];
        }
        
        System.out.println("Array after rotating left: " + Arrays.toString(rotatedArray));
    }
}
