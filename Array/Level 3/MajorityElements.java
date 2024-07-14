import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
    
        int max =nums.length/ 3;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
      
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2,3, 2, 1};
        List<Integer> majorityElements = majorityElement(nums);
        System.out.println("Majority Elements (> N/3 times): " + majorityElements);
    }
}
