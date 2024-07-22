public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8};
        int sum = 0;
        
        for (int num : array) {
            sum += num;
        }
        
        double average = (double) sum / array.length;
        System.out.println("Average of elements: " + average);
    }
}
