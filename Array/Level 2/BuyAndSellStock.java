public class BuyAndSellStock {
    public static int maxProfit(int arr[]) {
        int maxProfit = 0;
        int minPrice = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            // Calculate profit if we sell at current price
            int profit = arr[i] - minPrice;
            
            // Update maxProfit if current profit is greater
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            
            // Update minPrice if current price is lower
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("The maximum profit is " + maxProfit(arr));
    }
}
