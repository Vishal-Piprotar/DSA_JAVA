import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Frequency of each element: " + map);
    }
}
