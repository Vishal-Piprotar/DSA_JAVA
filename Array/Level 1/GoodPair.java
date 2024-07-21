import java.util.HashMap;

class GoodPair {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            int numCount = hm.getOrDefault(num, 0);
            result += numCount;
            hm.put(num, numCount + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        GoodPair sol = new GoodPair();
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(sol.numIdenticalPairs(nums)); // Output: 4
    }
}
