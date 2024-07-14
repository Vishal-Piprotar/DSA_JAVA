package Easy;
import java.util.HashSet;

/**
 * Union
 */
public class Union {

    public static int[] union(int arr1[], int[] arr2) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        int index = 0;
        int result[] = new int[set.size()];
        for (int k : set) {
            result[index++] = k;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 5, 6 };
        int result[] = union(arr1, arr2);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}