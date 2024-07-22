import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};

        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}
