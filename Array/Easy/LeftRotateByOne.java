import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        int first = array[0];
        
        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = first;
        
        System.out.println("Array after left rotation: " + Arrays.toString(array));
    }
}
