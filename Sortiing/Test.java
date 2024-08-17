public class Test {

    static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;

        //temp array
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i]=arr[low+i];
        }
        for (int j = 0; j < n2; j++) {
            right[j]=arr[mid+1+j];
        }

        int i=0; int j=0;
        int k=low;

        while (i<n1 && j<n2) {
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }

        while (i<n1) {
            arr[k++]=left[i++];
        }
        while (j<n2) {
            arr[k++]=right[j++];
        }
    }
    static void mergeSort(int arr[],int low ,int high){
        if(low<high){
            int mid =  low+(high-low)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        int n=arr.length;
        System.out.println("Given Array");
        printArray(arr);

        mergeSort(arr,0,n-1);
        System.out.println("\nSorted array");
        printArray(arr);

    }
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
