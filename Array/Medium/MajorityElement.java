import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = array.length;
        Map<Integer, Integer> m = new HashMap<>();

        for (int num : array) {
            m.put(num, m.getOrDefault(num, 0) + 1);
            if (m.get(num) > n / 2) {
                System.out.println("Majority element is: " + num);
                return;
            }
        }

        System.out.println("No majority element found.");
    }
}
