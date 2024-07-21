public class FindSingleNumber {
    public static int findSingle(int arr[]){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            // logic is a^a^b=b   same same is cut in xor
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5,5};
        System.out.println(findSingle(arr));
    }
}
