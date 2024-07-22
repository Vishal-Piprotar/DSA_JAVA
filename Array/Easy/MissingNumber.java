public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; 
        int n = 6;
        
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        
        for (int num : array) {
            arraySum += num;
        }
        
        int missingNumber = totalSum - arraySum;
        
        System.out.println("Missing number: " + missingNumber);
    }
}
