import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];
        
        System.arraycopy(array1, 0, mergedArray, 0, n1);
        System.arraycopy(array2, 0, mergedArray, n1, n2);
        
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
