public class BuildArrayPermutation {
    public static int[] pemutation(int arr[]){
        int array[] = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i]=arr[arr[i]];
        }
        return array;
    }
    public static void main(String[] args) {
        int nums[] = {0,2,1,5,3,4};
        int result[]= pemutation(nums);
        for (int i : result) {
            System.out.print(i+" ");
        }

    }
}
