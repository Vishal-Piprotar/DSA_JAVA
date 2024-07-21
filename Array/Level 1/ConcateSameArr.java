
public class ConcateSameArr {
public static int[] concate(int arr[]){
    int newArr[] = new int[arr.length*2];
    for (int i = 0; i < arr.length; i++) {
        newArr[i]=arr[i];   
        newArr[i+arr.length]=arr[i];   
    }
    return newArr;
}
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int result[]=concate(arr);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}