import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int n = array.length;
        int[] temp = new int[n];
        int j = 0;
        
        Arrays.sort(array);
        
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n - 1];
        
        int[] newArray = Arrays.copyOf(temp, j);
        
        System.out.println("Array without duplicates: " + Arrays.toString(newArray));
    }
}
