import java.util.HashMap;
import java.util.Map;

public class ModeArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 5, 5};
        Map<Integer, Integer> m = new HashMap<>();
        
        for (int num : array) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        
        int mode = 0;
        int maxCount = 0;
        
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        
        System.out.println("Mode of the array: " + mode);
    }
}
