public class SetMatrixZeroes {

    public static void setZeroes(int[][] metrix) {
        int m = metrix.length;
        int n = metrix[0].length;

        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(metrix[i][j]==0){
                    zeroRow[i]=true;
                    zeroCol[j]=true;
                }
            }
        }

        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                if(zeroRow[i] || zeroCol[j]){
                    metrix[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 0, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
