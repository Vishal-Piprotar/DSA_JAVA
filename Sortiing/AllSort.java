public class AllSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current =arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=current;

        }
    }

    public static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i]=arr[low+i];
        }
        for (int j = 0; j <n2; j++) {
            right[j]=arr[mid+1+j];
        }

        int i=0,j=0;
        int k=low;

        while (i<n1 && j<n2) {
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        }

        while (j<n2) {
            arr[k++]=right[j++];
        }

    }

    public static void mergesort(int arr[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;

            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }

    public static int partition(int arr[],int low,int high){
        int pivot =arr[high];
        int i =low-1;

        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }

    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);

            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        // BubbleSort(arr);
        // selectionSort(arr);
        // insertion(arr);
        // mergesort(arr, 0, arr.length-1);
        quicksort(arr,0,arr.length-1);
        printArray(arr);
    }
}
