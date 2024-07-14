package Easy;
import java.util.HashSet;

public class removeDuplicate {

    public static int removeDup(int arr[]){
        int index=0 ;//pointer
        for (int i = 1; i < arr.length; i++) {
            if(arr[index]!=arr[i]){
                index++;
                arr[index]=arr[i];
            }

        }
        return index+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};

        // M1 using Set
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     set.add(arr[i]);
        // }
        // System.out.println(set.size());
        // for (int num : set) {
        //     System.out.print(num);
        // }

        // M 2 use a two pointer 

       int k = removeDup(arr);
       for (int i =0;i<k;i++) {
        System.out.print(arr[i]+" ");
       }

    }
}
