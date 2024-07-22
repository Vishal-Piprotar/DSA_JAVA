public class Advanced2DArrayOperations {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // original 2D Array
        System.out.println("Original 2D array:");
        print2DArray(array);

        // 2D Array 90 Degrees Clockwise
        int[][] rotatedArray = rotate90DegreesClockwise(array);
        System.out.println("Array rotated 90 degrees clockwise:");
        print2DArray(rotatedArray);

        // Diagonal Elements
        System.out.println("Main diagonal elements:");
        printMainDiagonal(array);
        
        System.out.println("Anti-diagonal elements:");
        printAntiDiagonal(array);

        // Reversing Each Row
        int[][] reversedRowsArray = reverseEachRow(array);
        System.out.println("Array with each row reversed:");
        print2DArray(reversedRowsArray);

        // Reversing Each Column
        int[][] reversedColumnsArray = reverseEachColumn(array);
        System.out.println("Array with each column reversed:");
        print2DArray(reversedColumnsArray);
    }

    // Print a 2D Array
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2D Array 90 Degrees Clockwise
    public static int[][] rotate90DegreesClockwise(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] rotated = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotated[j][rows - 1 - i] = array[i][j];
            }
        }
        
        return rotated;
    }

    // Diagonal Elements
    public static void printMainDiagonal(int[][] array) {
        int minDimension = Math.min(array.length, array[0].length);
        for (int i = 0; i < minDimension; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
    }

    // Anti-Diagonal Elements
    public static void printAntiDiagonal(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows; i++) {
            if (i < cols) {
                System.out.print(array[i][cols - 1 - i] + " ");
            }
        }
        System.out.println();
    }

    // Reverse Each Row
    public static int[][] reverseEachRow(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] reversedRows = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversedRows[i][cols - 1 - j] = array[i][j];
            }
        }
        
        return reversedRows;
    }

    // Reverse Each Column
    public static int[][] reverseEachColumn(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] reversedColumns = new int[rows][cols];
        
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                reversedColumns[rows - 1 - i][j] = array[i][j];
            }
        }
        
        return reversedColumns;
    }
}
