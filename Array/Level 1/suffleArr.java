public class suffleArr {

    public static void shuffle(int arr[], int n) {
        int narr[] = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            narr[2 * i] = arr[i];
            narr[2 * i + 1] = arr[i + n];
        }
        
        // Copy shuffled array back to the original array
        System.arraycopy(narr, 0, arr, 0, narr.length);
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = 3;
        shuffle(arr, n);
        
        // Print the shuffled array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
