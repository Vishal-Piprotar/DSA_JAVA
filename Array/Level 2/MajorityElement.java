import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {
    public static int major(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = (int) Math.floor(arr.length / 2);

        for (Entry<Integer, Integer> entry:map.entrySet()) {
            if(entry.getValue()>max){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1,1,2,2,2,1,1};
        System.out.println(major(arr));
    }
}
