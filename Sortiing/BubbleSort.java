public class BubbleSort {

    public static void Bubblesort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                        int temp =arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,2};
        Bubblesort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
