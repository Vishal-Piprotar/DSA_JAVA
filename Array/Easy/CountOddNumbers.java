public class CountOddNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = 0;
        
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        
        System.out.println("Number of odd numbers: " + count);
    }
}
