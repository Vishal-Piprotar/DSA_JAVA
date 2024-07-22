import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15};
        int k = 3; 

        Arrays.sort(array);
        System.out.println(k + "th smallest element is: " + array[k - 1]);
    }
}
