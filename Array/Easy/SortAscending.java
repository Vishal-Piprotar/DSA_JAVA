import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 4};
        
        Arrays.sort(array);
        
        System.out.println("Sorted array in ascending order: " + Arrays.toString(array));
    }
}
