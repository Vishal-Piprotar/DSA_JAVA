import java.util.ArrayList;

public class MoveZeroes {


    // m1
    // public static void move(int arr[]){

    //     // using 2 pointer
    //     int index=0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i]!=0){
    //             arr[index]=arr[i];
    //             index++;
    //         }
    //     }
    //     for(int i=index;i<arr.length;i++){
    //         arr[i]=0;
    //     }

    // }

    public static int[] move(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }

        int size = list.size();

        for (int i = 0; i < size; i++) {
            arr[i]=list.get(i);
        }
        
        for (int i = size; i < arr.length; i++) {
            arr[i]=0;
            
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };

        // m1
        // move(arr);
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        // m2
        int result[]= move(arr);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
