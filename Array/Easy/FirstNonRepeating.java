import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4, 5};
        Map<Integer, Integer> m = new HashMap<>();
        
        for (int num : array) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        
        int firstNonRepeating = -1;
        for (int num : array) {
            if (m.get(num) == 1) {
                firstNonRepeating = num;
                break;
            }
        }
        
        if (firstNonRepeating != -1) {
            System.out.println("First non-repeating element: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating elements found.");
        }
    }
}
