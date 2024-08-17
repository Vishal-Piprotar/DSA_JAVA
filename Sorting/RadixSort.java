import java.util.Arrays;

public class RadixSort {

    // Main method to perform radix sort
    public void radixSort(int[] arr) {
        // Find the maximum number to determine the number of digits
        int max = Arrays.stream(arr).max().getAsInt();

        // Apply counting sort to sort elements based on each digit
        // exp is the exponent for the digit place (1s, 10s, 100s, etc.)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    // Method to perform counting sort based on a specific digit place
    private void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // Digits 0-9

        // Initialize count array to 0
        Arrays.fill(count, 0);

        // Store count of occurrences of each digit
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Update count array to store actual positions
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array by placing elements in their sorted position
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        RadixSort radixSort = new RadixSort();
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        radixSort.radixSort(arr);
        
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
