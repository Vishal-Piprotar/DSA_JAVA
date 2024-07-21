package string;
import java.util.ArrayList;
import java.util.List;

public class containChar {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        String[] words = {"apple", "banana", "cherry", "date", "fig"};
        char x = 'a';
        List<Integer> result =findWordsContaining(words, x);
        System.out.println(result); // Output: [0, 1, 3]
    }
}
