public class Search {

    // Binary Search 
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Linear Search 
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] binaryArr = { 2, 3, 4, 10, 40, 50, 70, 80 };
        int binaryKey = 10;
        int binaryResult = binarySearch(binaryArr, binaryKey);

        if (binaryResult == -1) {
            System.out.println("Element not found in the array (Binary Search)");
        } else {
            System.out.println("Element found at index: " + binaryResult + " (Binary Search)");
        }

        int[] linearArr = { 10, 23, 45, 70, 11, 15 };
        int linearKey = 70;
        int linearResult = linearSearch(linearArr, linearKey);

        if (linearResult == -1) {
            System.out.println("Element not found in the array (Linear Search)");
        } else {
            System.out.println("Element found at index: " + linearResult + " (Linear Search)");
        }
    }
}
