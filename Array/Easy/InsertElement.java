import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int n = array.length;
        int[] newArray = new int[n + 1];
        int element = 3;
        int position = 2;
        
        for (int i = 0; i < n + 1; i++) {
            if (i < position) {
                newArray[i] = array[i];
            } else if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
