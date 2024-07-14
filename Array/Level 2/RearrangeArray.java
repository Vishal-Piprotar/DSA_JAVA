import java.util.ArrayList;

public class RearrangeArray {
    public static void rearrangeBySign(int arr[]){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int num : arr) {
            if(num>0){
                positive.add(num);
            }else{
                negative.add(num);
            }
        }
       int posIndex=0,negIndex=0;
       int index=0;
       boolean isPositive=true;

       while (posIndex<positive.size() && negIndex<negative.size()) {
        if(isPositive){
            arr[index]=positive.get(posIndex);
            index++;
            posIndex++;
        }else{
            arr[index]=negative.get(negIndex);
            index++;
            negIndex++;
        }
        isPositive=!isPositive;
       }


       while(posIndex<positive.size()){
        arr[index]=positive.get(posIndex);
        index++;
        posIndex++;
       }
       while(negIndex<negative.size()){
        arr[index]=negative.get(negIndex);
        index++;
        negIndex++;
       }
    }
    public static void main(String[] args) {
        // int[] arr = {1, -2, 3, -4, 5, -6, 7, -8};
        int[] arr = {1,2,-4,-5};
        rearrangeBySign(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
