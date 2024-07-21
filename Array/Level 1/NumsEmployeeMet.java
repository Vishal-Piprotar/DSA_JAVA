class NumsEmployeeMet {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumsEmployeeMet sol = new NumsEmployeeMet();
        
        // Sample array and target value
        int[] hours = {8, 12, 5, 7, 10};
        int target = 10;
        
        // Call the method and print the result
        int result = sol.numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println("Number of employees who met or exceeded the target: " + result);
    }
}
