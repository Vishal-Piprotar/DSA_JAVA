package Easy;
    public class MissNumber {

        public static int findMiss(int arr[],int k){
            int actual = k*(k+1)/2;
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                sum=sum+arr[i];
            }
            return actual-sum;
        }
        public static void main(String[] args) {
            int arr[]={1};
            int k=2;
            System.out.println(findMiss(arr,k));
        }
    }
