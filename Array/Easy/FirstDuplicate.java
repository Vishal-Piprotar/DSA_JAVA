import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5};
        Set<Integer> seen = new HashSet<>();
        int duplicate = -1;
        
        for (int num : array) {
            if (seen.contains(num)) {
                duplicate = num;
                break;
            }
            seen.add(num);
        }
        
        if (duplicate != -1) {
            System.out.println("First duplicate element: " + duplicate +seen);
        } else {
            System.out.println("No duplicate elements found.");
        }
    }
}
