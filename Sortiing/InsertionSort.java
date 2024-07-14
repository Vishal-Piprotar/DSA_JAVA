public class InsertionSort {

    public static void Insert(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>current) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;

        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,2};
        Insert(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
