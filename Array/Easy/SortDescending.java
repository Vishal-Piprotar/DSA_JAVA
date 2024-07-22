import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        Integer[] array = {5, 2, 8, 1, 4};
        
        Arrays.sort(array, Collections.reverseOrder());
        
        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
    }
}
