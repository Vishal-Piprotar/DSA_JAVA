import java.util.Arrays;

public class RightRotateByOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        int last = array[n - 1];
        
        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
        
        System.out.println("Array after right rotation: " + Arrays.toString(array));
    }
}
