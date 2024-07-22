import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2{
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new HashSet<>();
        
        for (int num : array) {
            set.add(num);
        }
        
        int[] newArray = set.stream().mapToInt(Integer::intValue).toArray();
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));
    }
}
