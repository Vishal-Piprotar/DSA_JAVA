import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToDelete = 3;
        int n = array.length;
        int[] newArray = new int[n - 1];
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            if (array[i] != elementToDelete) {
                newArray[j++] = array[i];
            }
        }
        
        System.out.println("Array after deletion: " + Arrays.toString(newArray));
    }
}
