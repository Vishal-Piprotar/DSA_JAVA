public class Advanced2DArrayExample {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //  Row  Maximum Sum
        int maxRowSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                rowIndex = i;
            }
        }
        System.out.println("Row with the maximum sum: Row " + rowIndex + " (Sum = " + maxRowSum + ")");

        // Column with the Maximum Sum
        int maxColumnSum = Integer.MIN_VALUE;
        int columnIndex = -1;
        for (int j = 0; j < array[0].length; j++) {
            int columnSum = 0;
            for (int i = 0; i < array.length; i++) {
                columnSum += array[i][j];
            }
            if (columnSum > maxColumnSum) {
                maxColumnSum = columnSum;
                columnIndex = j;
            }
        }
        System.out.println("Column with the maximum sum: Column " + columnIndex + " (Sum = " + maxColumnSum + ")");

        // Print
        System.out.println("The 2D array is:");
        print2DArray(array);

        System.out.println("Sum of elements in each row:");
        int[] rowSums = calculateRowSums(array);
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Sum of row " + i + ": " + rowSums[i]);
        }
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] calculateRowSums(int[][] array) {
        int[] rowSums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            rowSums[i] = rowSum;
        }
        return rowSums;
    }
}
