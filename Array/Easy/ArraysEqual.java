import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5,6};
        
        boolean isEqual = Arrays.equals(array1, array2);
        
        System.out.println("Arrays are equal: " + isEqual);
    }
}
