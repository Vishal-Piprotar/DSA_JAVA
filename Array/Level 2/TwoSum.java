import java.util.HashMap;

public class TwoSum {

    public static int[] Twosum(int arr[],int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int second = target -arr[i];
            if(map.containsKey(second)){
                return new int[]{map.get(second),i};
            }
            map.put(arr[i], i);
        }
        return null;

    }
    public static void main(String[] args) {
        // int arr[]={2,6,5,8,11};
        int arr[]={2,6,5,8,11};
        // int target=14;
        int target=15;
        int result[] =Twosum(arr,target);
        if(result==null){
            System.out.println("not exisst pair");
        }else{
            System.out.println("pair  ("+result[0]+ ","+result[1]+")");
        }
    }
}