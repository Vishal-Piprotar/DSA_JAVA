public class MinElement {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 1, 6};
        int min = array[0];
        
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println("Minimum element: " + min);
    }
}
