public class RotateArr {
    public static void rotate(int arr[], int k) {
        int n = arr.length;

        //left rotate
        k = k % n;

        

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 1;
        rotate(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
