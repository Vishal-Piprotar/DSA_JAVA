public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            
            if (arr[mid] == key) {
                return mid;
            }

         
            if ( key>arr[mid]) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

      
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40, 50, 70, 80 };
        int key = 10;
        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
