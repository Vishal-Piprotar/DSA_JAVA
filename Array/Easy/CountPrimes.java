public class CountPrimes {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = 0;
        
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        
        System.out.println("Number of prime numbers: " + count);
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }
}
