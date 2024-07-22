import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueElements = new HashSet<>();
        
        for (int num : array) {
            uniqueElements.add(num);
        }
        
        System.out.println("Unique elements: " + uniqueElements);
    }
}
