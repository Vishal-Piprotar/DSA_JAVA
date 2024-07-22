public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {4, 1, 7, 3, 6, 8};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        System.out.println("Second largest element: " + secondLargest);
    }
}
