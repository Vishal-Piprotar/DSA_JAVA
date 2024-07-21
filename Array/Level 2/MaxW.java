
class MaxW {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Iterate through each customer
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;

            // Calculate the wealth for the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            // Update the maximum wealth if the current wealth is greater
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        int result = maximumWealth(accounts);
        System.out.println(result); // Output: 15
    }
}
