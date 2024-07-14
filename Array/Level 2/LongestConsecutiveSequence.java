import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int lcs(int arr[]) {
        int maxLength=0;
        HashSet<Integer>  set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int  num : arr) {
            if(!set.contains(num-1)){
                
                int currentElement = num;
                int currentLength=1;
                while (set.contains(currentElement+1)) {
                    currentElement++;
                    currentLength++;
                }

                maxLength=Math.max(maxLength, currentLength);
            }
        }


        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(lcs(arr));
    }
}
