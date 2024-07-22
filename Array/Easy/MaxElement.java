public class MaxElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 2, 5};
        int max = array[0];
        
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Maximum element: " + max);
    }
}
